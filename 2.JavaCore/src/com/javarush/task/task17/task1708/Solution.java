package com.javarush.task.task17.task1708;

        import java.util.ArrayList;
        import java.util.List;

/*
Заметки для всех
*/

public class Solution {

    public static void main(String[] args) {

        Note nn = new Note();
        Note nn2 = new Note();
        nn.addNote(0,"penis");
        nn2.addNote(0,"vagina");
        nn.addNote(1,"penis2");
        nn2.addNote(1,"vagina2");
        nn.removeNote(1);
        nn.removeNote(0);
        nn2.removeNote(1);
        nn2.removeNote(0);
//        nn.removeNote(1);

    }

    public static class Note extends Thread{

        public volatile List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}

















//package com.javarush.task.task17.task1708;
//
//import java.util.ArrayList;
//import java.util.List;
//
///*
//Заметки для всех
//*/
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static class Note {
//
//        public  volatile List<String> notes = new ArrayList<String>();
//
//        public void addNote(int index, String note) {
//            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
//            notes.add(index, note);
//            System.out.println("Уже добавлена заметка [" + note + "]");
//        }
//
//        public void removeNote(int index) {
//            System.out.println("Сейчас будет удалена заметка с позиции " + index);
//            String note = notes.remove(index);
//            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
//        }
//    }
//}
//
////volatile