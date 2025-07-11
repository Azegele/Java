import java.util.Scanner;

public class week2_exc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Larger number: " + num1);
        } else if (num2 > num1) {
            System.out.println("Larger number: " + num2);
        } else {
            System.out.println("These numbers are equal");
        }
    }
}