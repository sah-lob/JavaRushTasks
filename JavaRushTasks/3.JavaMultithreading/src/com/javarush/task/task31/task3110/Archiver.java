package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;

public class Archiver {

    public static void main(String[] args) throws Exception {

        ExitCommand exitCommand = new ExitCommand();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String st = bufferedReader.readLine();

        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(st));

        String ss = bufferedReader.readLine();
        zipFileManager.createZip(Paths.get(ss));


        exitCommand.execute();



    }
}
