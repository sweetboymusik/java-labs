import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter an integer (-999 to finish): ");
            num = input.nextInt();

            if (num == -999)
                break;

            sum += num;
            count++;
        }

        float avg = (float) sum / count;

        System.out.println("Stats");
        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Avg: %.2f", avg);
    }
}