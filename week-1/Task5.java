import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1, num2;
        float result = 0f;
        String operator = "+";

        System.out.print("Enter two floating point numbers: ");
        num1 = input.nextFloat();
        num2 = input.nextFloat();

        System.out.print("Enter an operator: ");
        operator = input.next();

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                System.err.println("not a valid character!");
                break;
        }

        System.out.printf("%f", num1);
        System.out.printf(" %s ", operator);
        System.out.printf("%f", num2);
        System.out.printf(" = %f", result);
    }
}
