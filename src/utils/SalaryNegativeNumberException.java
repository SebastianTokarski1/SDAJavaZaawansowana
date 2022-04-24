package utils;

public class SalaryNegativeNumberException extends RuntimeException {

    public SalaryNegativeNumberException(int salary) {
        super("Pensja nie może być ujemna " + salary);
    }
}
