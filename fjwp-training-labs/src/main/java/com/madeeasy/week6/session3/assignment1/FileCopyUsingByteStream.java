package com.madeeasy.week6.session3.assignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingByteStream {
    public static void main(String[] args) {
        final String sourceFilePath = "D:\\java-io-source-demo.txt";
        final String destinationFilePath = "D:\\java-io-target-demo.txt";

        try (FileInputStream in = new FileInputStream(sourceFilePath);
             FileOutputStream out = new FileOutputStream(destinationFilePath)) {

            StringBuilder stringBuilder = new StringBuilder();

            int input;

            while ((input = in.read()) != -1) {
                stringBuilder.append((char) input);
            }

            System.out.print(stringBuilder);

            System.out.println();

            // Write the accumulated data to the output file
            out.write(stringBuilder.toString().getBytes());

            System.out.println("Data successfully copied from source to target.");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
