package io.backendscience.uncheckedexceptions;

public class NullPointer {

    public static void main(String[] args) {
        Object obj = null;
        String result = callUninstaciatedObject(obj);
        System.out.println(result);
    }

    private static String callUninstaciatedObject(Object obj) {
        return obj.toString();
    }
}