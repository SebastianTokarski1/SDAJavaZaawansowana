package fruits;

public class Box<T extends Fruit> {

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public int getWeight() {
        return content.getWeight() + 2;
    }
}