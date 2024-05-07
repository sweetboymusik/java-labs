import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt;

        System.out.println("CONVERTER");
        System.out.println("1. Decimal -> Binary");
        System.out.println("2. Binary -> Decimal");
        System.out.print("Select an option: ");

        opt = input.nextInt();

        if (opt == 1) {
            int decimal;
            String binary;

            System.out.println("DECIMAL -> BINARY");
            System.out.println("Enter a deminal number: ");

            decimal = input.nextInt();
            binary = Integer.toBinaryString(decimal);

            System.out.printf("%d -> %s", decimal, binary);
        } else if (opt == 2) {
            String binary;
            int decimal;

            System.out.println("BINARY -> DECIMAL");
            System.out.println("Enter a binary number: ");

            binary = input.next();
            decimal = Integer.parseInt(binary, 2);

            System.out.printf("%s -> %d", binary, decimal);
        } else {
            System.out.println("Invalid option.");
        }
    }
}
