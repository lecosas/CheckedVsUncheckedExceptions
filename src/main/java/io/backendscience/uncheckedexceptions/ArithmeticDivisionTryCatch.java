package io.backendscience.uncheckedexceptions;

public class ArithmeticDivisionTryCatch {

    public static void main(String[] args) {
        int result = divideByZero();
        System.out.println(result);
    }

    private static int divideByZero() {
        try {
            return 20 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Invalid operation (it is not possible to divide a number by 0).");
            return 0;
        }
    }

}
