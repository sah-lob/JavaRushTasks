package com.javarush.task.task31.task3102;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        List<String> Alist = new ArrayList<>();

        Path paths = Paths.get(root);

        Stream<Path> files = Files.walk(paths);
        files = files.filter(Files::isRegularFile);

        files.collect(Collectors.toList()).forEach(file -> Alist.add(file.toString()));



//        Files .walk(Paths.get(root)).filter(Files::isRegularFile).collect(Collectors.toList()).forEach(i->list.add(i.toString()));

//        list = Files.walk(Paths.get(root)).filter(Files::isRegularFile).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        return Alist;
        }

public static void main(String[] args) {

        }
        }
