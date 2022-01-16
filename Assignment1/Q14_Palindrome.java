package Assignment1;

import java.util.Objects;
import java.util.Scanner;

public class Q14_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check for palindrome: ");
        String str = sc.next();
        System.out.println(palindrome(str) ? String.format("%s is a palindrome.", str) : String.format("%s is not a palindrome.", str));
        System.out.print("Enter the number to check for palindrome: ");
        int no = sc.nextInt();
        System.out.print(palindrome(no) ? String.format("%d is a palindrome.", no) : String.format("%d is not a palindrome", no));
    }

    public static boolean palindrome(String str) {
        return Objects.equals(str, reverse(str));
    }

    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        StringBuilder rev_str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--)
            rev_str.append(arr[i]);
        return rev_str.toString();
    }

    //    Method Overriding
    public static boolean palindrome(int num) {
        return num == reverse(num);
    }

    public static int reverse(int num) {
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();
        StringBuilder rev_str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--)
            rev_str.append(arr[i]);
        return Integer.parseInt(rev_str.toString());
    }
}