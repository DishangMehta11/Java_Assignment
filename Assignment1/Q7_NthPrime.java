package Assignment1;

import java.util.Scanner;

public class Q7_NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        nth_prime(n);
    }

    public static void nth_prime(int n) {
        int counter = 0, i = 2;
        while (counter != n) {
            if (Q5_PrimeCheck.is_prime(i)) {
                counter++;
                if (counter == n) {
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}