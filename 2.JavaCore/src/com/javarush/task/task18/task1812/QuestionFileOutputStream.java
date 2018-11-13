package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

class QuestioAnFileOutputStream implements AmigoOutputStream {

    @Override
    public void flush() throws IOException {
    flush();
    }

    @Override
    public void write(int b) throws IOException {
    write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
    write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
    write(b,off,len);
    }

    @Override
    public void close() throws IOException {

        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String we = reader.readLine();
        if(we.equals("Д")){
            close();
        }
    }
}

