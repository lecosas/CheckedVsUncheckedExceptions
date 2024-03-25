package io.backendscience.checkedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileServiceThrowsTryCatchCustom {

    public static void main(String[] args) {
        try {
            openFile("file-not-found.txt");
        } catch (FileNotFoundCustomException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void openFile(String path) throws FileNotFoundCustomException {
        try {
            FileReader file = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundCustomException(e);
        }
    }

}
