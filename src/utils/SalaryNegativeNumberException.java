package utils;

public class SalaryNegativeNumberException extends Exception {

    public SalaryNegativeNumberException(int salary) {
        super("Pensja nie może być ujemna " + salary);
    }
}
