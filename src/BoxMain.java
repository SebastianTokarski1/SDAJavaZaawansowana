import collections.Gender;
import collections.Person;
import fruits.Apple;
import fruits.Box;

public class BoxMain {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple(10));

        Box<Box<Apple>> appleContainer = new Box<>(appleBox);

        int weight = appleContainer.getWeight();

        System.out.println(weight);
    }
}
