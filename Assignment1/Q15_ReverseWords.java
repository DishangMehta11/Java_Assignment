package Assignment1;

import java.util.Scanner;

public class Q15_ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        reverse(sentence);
    }

    public static void reverse(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");
    }
}