package Recursion;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter ur no tht u want :");
        int num = scanner.nextInt();

        int ans = fact(num);
        System.out.println("fact of " + num + "is" + ans);
        scanner.close();

    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
