package com.javarush.task.task31.task3110;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {

    private Path zipFile;

    public ZipFileManager(Path zipFile) {

        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {

        ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
        ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
        InputStream inputStream = Files.newInputStream(source);

        try {
            zipOutputStream.putNextEntry(zipEntry);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            zipOutputStream.write(buffer);

        } catch (Exception ex){
            System.out.println("Что-то пошло не так!");
        } finally {
            zipOutputStream.close();
            inputStream.close();
        }
    }
}
