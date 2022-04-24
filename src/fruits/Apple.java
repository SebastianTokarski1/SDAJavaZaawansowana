package fruits;

import enumerated.Color;

public class Apple extends Fruit {

    private Color color;

    public Apple(int weight, Color color) {
        super(weight);
        this.color = color;
    }
}
