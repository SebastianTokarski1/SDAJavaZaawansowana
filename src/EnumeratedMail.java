import enumerated.Color;
import enumerated.MathOperation;
import enumerated.Size;

public class EnumeratedMail {

    public static void main(String[] args) {
        Integer x = 20;
        Color y = Color.BLUE;
        Color z = Color.RED;

        System.out.println(y.name());
        System.out.println(y.ordinal());

        System.out.println(z.name());
        System.out.println(z.ordinal());

        Color[] values = Color.values(); // GREEN, BLUE, RED
        Color red = Color.valueOf("RED");
        String redName = Color.RED.name();
        int redOrdinal = Color.RED.ordinal();

        System.out.println("---");

        Size sizeMedium = Size.MEDIUM;
        int mediumMaxWeight = sizeMedium.getMaxWeight();
        System.out.println(mediumMaxWeight);

        System.out.println("---");

        float result1 = MathOperation.ADD.calculate(10.0f, 5.0f);
        float result2 = MathOperation.SUBTRACT.calculate(10.0f, 5.0f);

        System.out.println(result1);
        System.out.println(result2);
    }
}
