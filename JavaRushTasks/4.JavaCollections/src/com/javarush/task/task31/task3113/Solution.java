package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;

/*
Что внутри папки?
*/
public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String link = bufferedReader.readLine();
//        link ="/Users/alexanderlobachev/Desktop/Английский язык";
        Path path = Paths.get(link);
        if(!Files.isDirectory(path)){
            System.out.println(link + " - не папка");
        } else {
            int chislopapok = 0;
            int chislofailov = 0;
            long razmer = 0;

            MyFileVisitor myFileVisitor = new MyFileVisitor();
            Files.walkFileTree(path, myFileVisitor);

            System.out.println("Всего папок - " + myFileVisitor.getChislopapok());
            System.out.println("Всего файлов - " + myFileVisitor.getChislofailov());
            System.out.println("Общий размер - " + myFileVisitor.getRazmer());

        }
    }
}


class MyFileVisitor extends SimpleFileVisitor<Path>{

    private int chislopapok = -1;
    private int chislofailov = 0;
    private long razmer = 0;
    private Path path;


    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        if(Files.isDirectory(dir)){
            chislopapok = chislopapok + 1;
        }
        razmer = razmer+ Files.size(dir);

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if(!Files.isDirectory(file)){
            chislofailov = chislofailov + 1;
        }
        razmer = razmer + Files.size(file);
        return FileVisitResult.CONTINUE;
    }


    public int getChislopapok() {
        return chislopapok;
    }

    public int getChislofailov() {
        return chislofailov;
    }

    public long getRazmer() {
        return razmer;
    }
}
