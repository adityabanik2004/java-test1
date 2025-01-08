class test6 {
    public static void main(String[] args) {          //Main method
        if (args.length < 2) {
            System.out.println("Please provide both username and password.");
            return;
        }
        String username = args[0];
        String password = args[1];
        UserLogin(username, password);
    }

    static void UserLogin(String username, String password) {
        switch (username) {
            case "ankan":
                switch (password) {                     //Switch case logic for login
                    case "Madhu":
                        System.out.println("Login Successful!, welcome Ankan");
                        break;
                    case "trisha":
                        System.out.println("Login Successful!, welcome Ankan");
                        break;
                    default:
                        System.out.println("Incorrect password");
                        break;
                }
                break;
            case "souparno":
                switch (password) {
                    case "Madhu":
                        System.out.println("Login Successful!, welcome Souparno");
                        break;
                    case "trisha":
                        System.out.println("Login Successful!, welcome Souparno");
                        break;
                    default:
                        System.out.println("Incorrect password");
                        break;
                }
                break;
            default:
                System.out.println("Incorrect Username");
                break;
        }
    }
}
