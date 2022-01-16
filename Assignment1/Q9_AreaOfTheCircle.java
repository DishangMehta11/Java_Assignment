package Assignment1;

import java.util.Scanner;

public class Q9_AreaOfTheCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = sc.nextFloat();
        System.out.println("The area of the circle is: " + area(r));
    }

    public static double area(float r) {
        return Math.PI * r * r;
    }
}