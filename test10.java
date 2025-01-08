import java.util.Scanner;

public class test10 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i * i <= num; i++) { // Optimized for loop
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is prime and " + (number % 2 != 0 ? "odd" : "even"));
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}