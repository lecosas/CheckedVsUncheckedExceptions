package io.backendscience.checkedexceptions;

class FileNotFoundCustomException extends Exception {

    public FileNotFoundCustomException(Exception e) {
        super(e);
    }

    @Override
    public String getMessage() {
        return "Error opening the file.";
    }
}