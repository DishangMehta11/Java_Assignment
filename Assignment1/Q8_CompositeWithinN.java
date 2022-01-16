package Assignment1;
import java.util.Scanner;
public class Q8_CompositeWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        composite_check(n);
    }
    public static void composite_check(int n) {
        System.out.print(2 + " ");
        for (int i = 1; i <= n; i++)
            if (!Q5_PrimeCheck.is_prime(i))
                System.out.print(i + " ");
    }
}