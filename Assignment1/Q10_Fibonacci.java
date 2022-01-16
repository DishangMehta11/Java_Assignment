package Assignment1;

import java.util.Scanner;

public class Q10_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.print(fibonacci(n)[i] + " ");
    }

    public static int[] fibonacci(int n) {
        int a = 0;
        int b = 1;
        int sum;
        int[] arr = new int[n];
        arr[0] = a;
        for (int i = 1; i <= n - 1; i++) {
            sum = a + b;
            b = a;
            a = sum;
            arr[i] = sum;
        }
        return arr;
    }
}