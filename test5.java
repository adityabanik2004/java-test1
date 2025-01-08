public class test5 {

    public static void main(String[] args) {
        int sum = EvenNumbers(2, 20); 
        System.out.println("Sum of even numbers from 1 to 20: " + sum);
    }

    public static int EvenNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i += 2) {
            sum += i;
        }
        return sum;
    }
}
