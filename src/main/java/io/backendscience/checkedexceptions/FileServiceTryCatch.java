package io.backendscience.checkedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileServiceTryCatch {

    public static void main(String[] args) {
        openFile("file-not-found.txt");
    }

    private static void openFile(String path) {
        try {
            FileReader file = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file.");
        }
    }

}
