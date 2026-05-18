import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int sum = 0;

        for (int temp = num; temp != 0; temp = temp / 10) {
            digits++;
        }

        for (int temp = num; temp != 0; temp = temp / 10) {

            int digit = temp % 10;
            sum += Math.pow(digit, digits);
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}