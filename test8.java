public class test8 {

    public static void printNumbersForLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumbersWhileLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void printNumbersDoWhileLoop() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbersForLoop();
        printNumbersWhileLoop();
        printNumbersDoWhileLoop();
    }
}