import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int[] freqs = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int num : array) {
            freqs[num] += 1;
        }

        System.out.println("Number\tFrequency");
        for (int i = 0; i < freqs.length; i++) {
            System.out.printf("  %d  \t   %d\n", i, freqs[i]);
        }
    }
}
