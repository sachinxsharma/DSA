package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        if (isPalindrome(num)) {
            System.out.println(num + "is palindrome");
        } else {
            System.out.println(num + " is not palindrome");
        }

    }

    static boolean isPalindrome(int num) {
        int reverseNum = reverse(num);
        return num == reverseNum;
    }

    static int reverse(int num) {
        return reverseHelper(num, 0);
    }

    static int reverseHelper(int num, int reverseNum) {
        if (num == 0) {
            return reverseNum;
        }
        int lastDigit = num % 10;
        reverseNum = reverseNum * 10 + lastDigit;

        return reverseHelper(num / 10, reverseNum);
    }

}
