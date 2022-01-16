package Assignment1;

import java.util.Scanner;

public class Q6_PrimeCheckRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int start = sc.nextInt();
        System.out.print("Enter the start range: ");
        int last = sc.nextInt();
        System.out.printf("Prime numbers between %d and %d are: ", start,
                last);
        prime_range(start, last);
    }

    public static void prime_range(int start, int end) {
        for (int i = start; i < end; i++)
            if (Q5_PrimeCheck.is_prime(i))
                System.out.print(i + " ");
    }
}