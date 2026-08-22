public class Practical7 {
    public static void main(String[] args) {

        int number = 2;
        int sum = 0;

        while (number <= 50) {
            sum = sum + number;
            number = number + 2;
        }

        System.out.println("Sum of even numbers between 1 and 50: " + sum);
    }
}