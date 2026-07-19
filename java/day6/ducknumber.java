import java.util.Scanner;

public class ducknumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int originalNum = num;
        int countOfZeros = 0;

        // Check for duck number
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0) {
                countOfZeros++;
            }
            num /= 10;
        }

        if (countOfZeros > 0 && originalNum != 0) {
            System.out.println(originalNum + " is a duck number.");
        } else {
            System.out.println(originalNum + " is not a duck number.");
        }
    }
}
