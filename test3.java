import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the largest of the two numbers
        int largest = (num1 > num2) ? num1 : num2;

        // Get the third number
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the sum of the first two numbers
        int sum = num1 + num2;

        // Find the smallest of the sum and the third number
        int smallest = (sum < num3) ? sum : num3;

        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);
    }
}