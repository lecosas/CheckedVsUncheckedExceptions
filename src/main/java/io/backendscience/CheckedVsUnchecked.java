package io.backendscience;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        returnRuntimeException();
        returnException();
    }

    private static void returnRuntimeException() {
        throw new RuntimeException();
    }

    private static void returnException() {
        /*
            It is not possible to compile because the checked exception
            has not been handled.
         */
        throw new Exception();
    }
}