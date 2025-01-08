public class Test {

    public static String checkNumber(int i) {
        if (i == 3) {
            return "I am 3";
        } else if (i == 5) {
            return "I am 5";
        } else {
            return String.valueOf(i); 
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(checkNumber(i));
        }
    }
}
