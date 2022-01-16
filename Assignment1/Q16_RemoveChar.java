package Assignment1;

import java.util.Scanner;

public class Q16_RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter the position: ");
        int index = sc.nextInt();
        System.out.printf(rev_char(str, index) + " is what we get by removing from % d position in % s", index, str);
    }

    public static String rev_char(String str, int i) {
        return str.substring(0, i - 1) + str.substring(i);
    }
}