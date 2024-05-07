import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter int 1: ");
        nums[0] = input.nextInt();
        System.out.println("Enter int 2: ");
        nums[1] = input.nextInt();
        System.out.println("Enter int 3: ");
        nums[2] = input.nextInt();
        System.out.println("Enter int 4: ");
        nums[3] = input.nextInt();
        System.out.println("Enter int 5: ");
        nums[4] = input.nextInt();

        int max = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (max < nums[i + 1]) {
                max = nums[i + 1];
            }
        }

        System.out.println(max);

    }
}
