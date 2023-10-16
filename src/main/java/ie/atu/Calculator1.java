package ie.atu;

import java.util.Scanner;



public class Calculator1 {

    public static void main(String[] args) {
        subtract();
        add();
        Multiple();
    }

    private static void Multiple() {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
    }

    private static void subtract() {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
    }

    public static void add()
    {

    }
}
