package Assignment1;

import java.util.Scanner;

public class Q5_PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int no = sc.nextInt();
        System.out.print(is_prime(no) ? String.format("%d is a prime number.", no) : String.format("%d is a composite number.", no));
    }

    public static boolean is_prime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}