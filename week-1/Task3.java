public class Task3 {
    public static void main(String[] args) {
        float amount = 1000.00f;
        float rate = 0.05f;

        System.out.println("Year\tAmount on Deposit");

        for (int i = 1; i < 11; i++) {
            amount += (amount * rate);
            System.out.printf("%d   \t   %.2f\n", i, amount);
        }
    }
}
