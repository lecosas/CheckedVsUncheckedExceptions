package io.backendscience.checkedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileServiceThrowsTryCatch {

    public static void main(String[] args) {
        try {
            openFile("file-not-found.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file.");
        }
    }

    private static void openFile(String path) throws FileNotFoundException {
        FileReader file = new FileReader(path);
    }

}
