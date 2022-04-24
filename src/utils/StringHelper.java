package utils;

public class StringHelper {

    public static int parseToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            // e.getClass().getCanonicalName()
            System.out.println("Zamiana wartości nie powiodła się " + e.getMessage());
            return 0;
        } finally {
            System.out.println("Zamiana zakończona dla wartości " + value);
        }
    }

    public static String calculateSalary(int salary, int bonus) {
        int sum = salary + bonus;
        if (sum < 0) {
            throw new SalaryNegativeNumberException(sum);
        }
        return String.valueOf(sum);
    }
}
