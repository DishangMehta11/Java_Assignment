package Assignment1;

import java.util.Scanner;

public class Q1_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        System.out.println("Factorial of the number is: " +
                fact(no));
    }

    static int fact(int a) {
        if (a == 0)
            return 1;
        else if (a > 0)
            return a * fact(a - 1);
        else
            return 0;

    }
}