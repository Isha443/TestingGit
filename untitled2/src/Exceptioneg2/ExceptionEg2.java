package Exceptioneg2;

public class ExceptionEg2 {
    public static void main(String[] args) {
        // Create an array of size 10
        int[] bounces = new int[10];

        // Set the value of the 4th element (index 3)
        bounces[3] = 42; // You can set any value here

        // Print the array
        System.out.println("Array bounces:");
        for (int i = 0; i < bounces.length; i++) {
            System.out.println("bounces[" + i + "] = " + bounces[i]);
        }
    }
}

