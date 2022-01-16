package Assignment1;

import java.util.Scanner;

public class Q13_SumOfCubeOfNNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans_wo_formula = sum_cube_wo_formula(n);
        int ans_with_formula = sum_cube_formula(n);
        System.out.println("The sum of cube of n natural numbers is(without formula): " + ans_wo_formula);
        System.out.print("The sum of cube of n natural numbers is(with formula): " + ans_with_formula);
    }

    public static int sum_cube_wo_formula(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }
        return sum;
    }

    // or with formula
    public static int sum_cube_formula(int n) {
        return n * n * (n + 1) * (n + 1) / 4;
    }
}