package com.andrew.ws.soap;

import jakarta.activation.DataHandler;
import jakarta.activation.FileDataSource;

import java.io.*;

public class FileWsImpl implements FileWs{
    @Override
    public void upload(DataHandler attachment) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = attachment.getInputStream();
             outputStream = new FileOutputStream(new File("C:\\Users\\HP\\Desktop\\Soap-WebService\\uploaded\\test.jpg"));
            byte[] b = new byte[100_000];
            int bytesRead = 0;

            while((bytesRead=inputStream.read(b)) != -1) {
                outputStream.write(b, 0, bytesRead);
            }
        } catch (IOException e) {
           e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();

            }

        }

    }

    @Override
    public DataHandler download() {
        return new DataHandler(new FileDataSource(new File("C:\\Users\\HP\\Desktop\\Soap-WebService\\uploaded\\test.jpg")));
    }
}
