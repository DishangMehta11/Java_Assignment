package Assignment1;

import java.util.Scanner;
import java.lang.Math;

public class Q3_04_ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Press 1 for armstrong and press 2 for armstrong range: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter the number you want to check: ");
                int n = sc.nextInt();
                System.out.print(is_armstrong(n) ? String.format("%d is Armstrong.", n)
                        : String.format("%d is not an Armstrong number.",
                        n));
            }
            case 2 -> {
                System.out.print("Enter the starting range: ");
                int start = sc.nextInt();
                System.out.print("Enter the ending range: ");
                int end = sc.nextInt();
                Q3_04_ArmstrongCheck arm = new Q3_04_ArmstrongCheck();
                System.out.printf("Armstrong numbers between %d and %d are: ", start, end);
                arm.armstrong_range(start, end);
            }
        }
    }

    public static boolean is_armstrong(int n) {
        String ns = Integer.toString(n);
        int len = ns.length();
        int sum = 0;
        char[] single = new char[len];
        for (int j = 0; j < len; j++)
            single = ns.toCharArray();
        for (int i = 0; i < len; i++) {
            int fnl = Integer.parseInt(String.valueOf(single[i]));
            sum += Math.pow(fnl, len);
        }
        return sum == n;
    }

    void armstrong_range(int start, int end) {
        for (int i = start; i <= end; i++)
            if (is_armstrong(i))
                System.out.print(i + " ");
    }
}