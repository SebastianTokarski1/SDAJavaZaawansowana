import java.io.FileNotFoundException;

public class ExceptionMain {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        calculate(20);

        int age = 10;

        try {
            doSomething(age);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(4);
        System.out.println(5);
    }

    private static void doSomething(int age) throws FileNotFoundException {
        if (age < 0) {
            throw new IllegalArgumentException("Wiek nie moze byc ujemny");
        }

        if (age < 0) {
            throw new FileNotFoundException("Wiek nie moze byc ujemny");
        }
    }

    private static void calculate(int value) {
        System.out.println(1);
        if (value % 2 == 0) {
            return;
        }
        System.out.println(2);
        System.out.println(3);
    }
}
