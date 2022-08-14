package Calculation;

import java.util.Scanner;

public class Calculation {
    private int[] arr;

    Calculation() {
    }

    Calculation(int[] arr) {
        this.arr = arr;
    }

    public static int[] inputIntegers() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("Enter the integer:");
        } else if (n > 1) {
            System.out.println("Enter the integers:");
        } else {
            in.close();
            System.out.println("Invalid input!");
            return new int[0];
        }

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            // System.out.print("[" + (i + 1) + "]: ");
            arr[i] = in.nextInt();
        }

        in.close();

        return arr;
    }

    public void sum() {
        if (this.arr.length == 0) {
            System.out.println("Undefined");
            return;
        }

        int result = this.arr[0];
        System.out.print("\nCalculate: " + this.arr[0]);
        for (int i = 1; i < this.arr.length; i++) {
            System.out.print(" + " + this.arr[i]);
            result += this.arr[i];
        }
        System.out.println("\nSum = " + result);
    }

    public void sub() {
        if (this.arr.length == 0) {
            System.out.println("Undefined");
            return;
        }

        int result = this.arr[0];
        System.out.print("\nCalculate: " + this.arr[0]);
        for (int i = 1; i < this.arr.length; i++) {
            System.out.print(" - " + this.arr[i]);
            result -= this.arr[i];
        }
        System.out.println("\nRemaining = " + result);
    }

    public void mul() {
        if (this.arr.length == 0) {
            System.out.println("Undefined");
            return;
        }

        int result = this.arr[0];
        System.out.print("\nCalculate: " + this.arr[0]);
        for (int i = 1; i < this.arr.length; i++) {
            System.out.print(" * " + this.arr[i]);
            result *= this.arr[i];
        }
        System.out.println("\nProduct = " + result);
    }

    public void div() {
        if (this.arr.length == 0) {
            System.out.println("Undefined");
            return;
        }

        int result = this.arr[0];
        System.out.print("\nCalculate: " + this.arr[0]);
        for (int i = 1; i < this.arr.length; i++) {
            System.out.print(" / " + this.arr[i]);
            result /= this.arr[i];
        }
        System.out.println("\nQuotient = " + result);
    }

    public void mod() {
        if (this.arr.length == 0) {
            System.out.println("Undefined");
            return;
        }

        int result = this.arr[0];
        System.out.print("\nCalculate: " + this.arr[0]);
        for (int i = 1; i < this.arr.length; i++) {
            System.out.print(" % " + this.arr[i]);
            result %= this.arr[i];
        }
        System.out.println("\nRemainder = " + result);
    }

    public static void main(String[] args) {

        Calculation cal = new Calculation(Calculation.inputIntegers());
        cal.sum();
        cal.sub();
        cal.mul();
        cal.div();
        cal.mod();

    }
}