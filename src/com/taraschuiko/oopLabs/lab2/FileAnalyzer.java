package com.taraschuiko.oopLabs.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAnalyzer {
    private File file;
    private int n;

    public FileAnalyzer() {
        this.file = new File("");
        this.n = 0;
    }

    public FileAnalyzer(String path) {
        this.file = new File(path);
    }

    public FileAnalyzer(String path, int n) {
        this.file = new File(path);
        this.n = n;
    }

    public FileAnalyzer(FileAnalyzer fileAnalyzer) {
        this.file = fileAnalyzer.getFile();
        this.n = fileAnalyzer.getN();
    }

    public boolean hasChain(String chain) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(chain)) {
                    return true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        return false;
    }

    public int numberOfChains(String chain) {
        try {
            Scanner scanner = new Scanner(file);
            String fileContent = "";
            while (scanner.hasNextLine()) {
                fileContent += scanner.nextLine();
            }

            int lastIndex = 0;
            int count = 0;
            while(lastIndex != -1){
                lastIndex = fileContent.indexOf(chain,lastIndex);
                if(lastIndex != -1){
                    count ++;
                    lastIndex += chain.length();
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

    public int getN() {
        return n;
    }
}
