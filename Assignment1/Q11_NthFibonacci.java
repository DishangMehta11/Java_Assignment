package Assignment1;

import java.util.Scanner;

import static Assignment1.Q10_Fibonacci.fibonacci;

public class Q11_NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The nth element of the fibonnaci series is: " +
                nth_fibonacci(n));
    }

    public static int nth_fibonacci(int n) {
        return fibonacci(n)[fibonacci(n).length - 1];
    }
}