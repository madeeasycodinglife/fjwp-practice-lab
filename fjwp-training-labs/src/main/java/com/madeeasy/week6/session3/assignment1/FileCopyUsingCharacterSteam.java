package com.madeeasy.week6.session3.assignment1;

import java.io.*;

public class FileCopyUsingCharecterSteam {
    public static void main(String[] args) {
        String sourceFilePath = "D:\\java-io-source-demo.txt";
        String targetFilePath = "D:\\java-io-target-demo.txt";
        File readFile = new File(sourceFilePath);
        File writeFile = new File(targetFilePath);
        try (FileReader fileReader = new FileReader(readFile);
             FileWriter fileWriter = new FileWriter(writeFile)) {

            int input = 0;
            while ((input = fileReader.read()) != -1) {
                fileWriter.write(input);
            }
            System.out.println("successfully wrote to the target file");
            System.out.println("please check your target file");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
