public class TestEmployee {
    public static void main(String[] args) {
        Employee John = new Employee(123, "John", "Smith", 4500);
        Employee James = new Employee(124, "James", "Smith", 5000);

        System.out.println(John.getAnnualSalary());
        System.out.println(James.getAnnualSalary());

        John.raiseSalary(20);
        James.raiseSalary(20);

        System.out.println(John.getSalary());
        System.out.println(James.getSalary());
    }
}
