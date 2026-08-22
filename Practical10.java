import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] marks = new float[5];
        float sum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextFloat();
            sum = sum + marks[i];
        }

        double average = sum / 5.0;

        if (average >= 90) {
            System.out.println("Grade: A");
        }
        else if (average >= 75) {
            System.out.println("Grade: B");
        }
        else if (average >= 50) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: Fail");
        }

        System.out.println("Average Marks: " + average);

        sc.close();
    }
}