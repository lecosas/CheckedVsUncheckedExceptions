package io.backendscience.uncheckedexceptions;

public class ArithmeticDivision {

    public static void main(String[] args) {
        int result = divideByZero();
        System.out.println(result);
    }

    private static int divideByZero() {
        return 20 / 0;
    }

}
