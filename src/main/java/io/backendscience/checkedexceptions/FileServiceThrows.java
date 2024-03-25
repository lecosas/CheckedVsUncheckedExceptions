package io.backendscience.checkedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileServiceThrows {

    public static void main(String[] args) throws FileNotFoundException {
        openFile("file-not-found.txt");
    }

    private static void openFile(String path) throws FileNotFoundException {
        FileReader file = new FileReader(path);
    }

}
