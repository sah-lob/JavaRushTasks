package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();


    public static void sendBroadcastMessage(Message message) {
        try {
            for (Map.Entry<String, Connection> pair : connectionMap.entrySet())
                pair.getValue().send(message);
        }
        catch (IOException e) {
            ConsoleHelper.writeMessage("Message was not sent!");
        }
    }

    public static void main(String[] args) throws IOException {

        int port = ConsoleHelper.readInt();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Сервер запущен");
           while (true){
               Socket socket = null;
               try {
                   socket = serverSocket.accept();
                   Handler handler = new Handler(socket);
                   handler.start();
               } catch (IOException e) {
                   e.printStackTrace();
                   serverSocket.close();
                   break;
               }
           }

    }

    private static class Handler extends Thread{
        private Socket socket;

        public Handler(Socket socket){
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{

            while (true) {
                // Сформировать и отправить команду запроса имени пользователя
                connection.send(new Message(MessageType.NAME_REQUEST));
                // Получить ответ клиента
                Message message = connection.receive();

                // Проверить, что получена команда с именем пользователя
                if (message.getType() == MessageType.USER_NAME) {

                    //Достать из ответа имя, проверить, что оно не пустое
                    if (message.getData() != null && !message.getData().isEmpty()) {

                        // и пользователь с таким именем еще не подключен (используй connectionMap)
                        if (connectionMap.get(message.getData()) == null) {

                            // Добавить нового пользователя и соединение с ним в connectionMap
                            connectionMap.put(message.getData(), connection);
                            // Отправить клиенту команду информирующую, что его имя принято
                            connection.send(new Message(MessageType.NAME_ACCEPTED));

                            // Вернуть принятое имя в качестве возвращаемого значения
                            return message.getData();
                        }
                    }
                }
            }
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (String key : connectionMap.keySet()) {
                Message message = new Message(MessageType.USER_ADDED, key);

                if (!key.equals(userName)) {
                    connection.send(message);
                }
            }
        }

        /** Главный цикл обработки сообщений сервером **/
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {

            while (true) {
                Message message = connection.receive();
                // Если принятое сообщение – это текст (тип TEXT)
                if (message.getType() == MessageType.TEXT) {

                    String s = userName + ": " + message.getData();

                    Message formattedMessage = new Message(MessageType.TEXT, s);
                    sendBroadcastMessage(formattedMessage);
                } else {
                    ConsoleHelper.writeMessage("Error");
                }
            }
        }

        @Override
        public void run() {

            ConsoleHelper.writeMessage("Установленно соединение с адресом " + socket.getRemoteSocketAddress());
            String clientName = null;
            //Создаем Connection
            try (Connection connection = new Connection(socket)) {
                //Выводить сообщение, что установлено новое соединение с удаленным адресом
                ConsoleHelper.writeMessage("Подключение к порту: " + connection.getRemoteSocketAddress());
                //Вызывать метод, реализующий рукопожатие с клиентом, сохраняя имя нового клиента
                clientName = serverHandshake(connection);
                //Рассылать всем участникам чата информацию об имени присоединившегося участника (сообщение с типом USER_ADDED)
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, clientName));
                //Сообщать новому участнику о существующих участниках
                sendListOfUsers(connection, clientName);
                //Запускать главный цикл обработки сообщений сервером
                serverMainLoop(connection, clientName);


            } catch (IOException | ClassNotFoundException e){
                System.out.println("Произошла ошибка при обмене данными с удаленным адресом.");
            }
            if(clientName!=null){
            //После того как все исключения обработаны, удаляем запись из connectionMap
            connectionMap.remove(clientName);
            //и отправлялем сообщение остальным пользователям
            sendBroadcastMessage(new Message(MessageType.USER_REMOVED, clientName));
            }

            ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто");

        }
    }
}