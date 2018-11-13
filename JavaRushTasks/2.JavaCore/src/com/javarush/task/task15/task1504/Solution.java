package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public static class MarkTwainBook extends Book {
        String title;
        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title=title;
        }

        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }


//
//    public static class MarkTwainBook extends Book {
//        String title;
//        public MarkTwainBook(String title) {
//            super("Mark Twain");
//            this.title = title;
//        }
//        public MarkTwainBook getBook() { return this; }
//        public String getTitle() { return title; }
//    }


    public static class AgathaChristieBook extends Book {
String title;
        public AgathaChristieBook (String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return AgathaChristieBook.this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;
            String output = "output";
            if (this instanceof AgathaChristieBook) output = agathaChristieOutput;
            if (this instanceof MarkTwainBook) output = markTwainOutput;

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}

//
//    Метод getOutputByBookType должен возвращать корректную строку для объектов типа AgathaChristieBook.
//        13. Метод getOutputByBookType должен возвращать корректную строку для объектов типа MarkTwainBook.
//        14. В классе MarkTwainBook должно быть создано поле title типа String(название книги).