package com.taraschuiko.oopLabs.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAnalyzer<Type> {
    private File file;
    private long n;
    private Type chain;

    public FileAnalyzer() {
        this.file = new File("");
        this.n = 0;
        this.chain = null;
    }

    public FileAnalyzer(String path, Type chain) {
        this.file = new File(path);
        n = file.length();
        this.chain = chain;
    }

    public FileAnalyzer(FileAnalyzer fileAnalyzer) {
        this.file = fileAnalyzer.getFile();
        this.n = fileAnalyzer.getN();
    }

    public boolean hasChain() {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains("" + chain)) {
                    return true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        return false;
    }

    public int numberOfChains() {
        try {
            Scanner scanner = new Scanner(file);
            String fileContent = "";
            while (scanner.hasNextLine()) {
                fileContent += scanner.nextLine();
            }

            int lastIndex = 0;
            int count = 0;
            while(lastIndex != -1){
                lastIndex = fileContent.indexOf("" + chain, lastIndex);
                if(lastIndex != -1){
                    count ++;
                    lastIndex += ("" + chain).length();
                }
            }
            scanner.close();

            return count;
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        return 0;
    }

    public File getFile() {
        return file;
    }

    public long getN() {
        return n;
    }
}
