class test7 {
      static int getLength(String str) {
        return str.length();                        
    }

    public static void main(String[] args) {
        processUsernames(args);                    
    }

    static void processUsernames(String[] args) {
        if (args.length < 3) {
            return;
        }                                            
        for (int i = 0; i < args.length; i++) {
            int length = getLength(args[i]);
            switch (length) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    System.out.println("Hello " + args[i] + ", Username length is: " + length);
                    break;
                default:
                    System.out.println("Sorry, the username is too short");
                    break;
            }
        }
    }
}