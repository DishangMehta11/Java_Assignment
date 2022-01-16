package Assignment1;

import java.util.Scanner;

public class Q2_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of years: ");
        int n = sc.nextInt();
        int interestCalculated = interest(p, r, n);
        System.out.println("The amount of interest is: " + interestCalculated);
        System.out.println("Total payable amount is: " + (p + interestCalculated));
    }

    public static int interest(int p, int r, int n) {
        return p * r * n / 100;
    }
}