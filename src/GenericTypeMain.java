import animals.Dog;
import animals.Duck;
import animals.Runner;
import enumerated.Color;
import fruits.Apple;
import fruits.Box;

public class GenericTypeMain {

    public static void main(String[] args) {
        Apple apple = new Apple(10, Color.RED);
        Box<Apple> appleBox = new Box<Apple>(apple);

        Apple content = appleBox.getContent();
        int weight = appleBox.getWeight();

        System.out.println(weight);

    }
}
