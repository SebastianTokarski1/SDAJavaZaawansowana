import enumerated.Color;

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
    }
}
