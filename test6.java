import java.util.Scanner;

public class test6
{

    public static boolean login(String username, String
	password) {
        switch (username) {
            case "Ankan":
                switch (password) {
                    case "Madhu":
                        return true;
                    default:
                        break;
                }
                break;
            case "Souparna":
                switch (password) {
                    case "Trisha":
                        return true;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}