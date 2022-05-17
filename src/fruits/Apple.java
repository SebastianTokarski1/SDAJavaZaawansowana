package fruits;

public class Apple extends Fruit {

    public Apple(Integer weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Jabłko: " + String.valueOf(weight);
    }
}
