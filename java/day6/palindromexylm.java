//palirome and xylem number

import java.util.Scanner;

public class palindromexylm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        // Check for palindrome
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }

        // Check for xylem number
        int sumOfDigits = 0;
        int productOfDigits = 1;
        num = originalNum;

        while (num != 0) {
            int digit = num % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            num /= 10;
        }

        if (sumOfDigits == productOfDigits) {
            System.out.println(originalNum + " is a xylem number.");
        } else {
            System.out.println(originalNum + " is not a xylem number.");
        }
    }
}
