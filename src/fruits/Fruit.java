package fruits;

public abstract class Fruit implements WeightProvider, Comparable<Fruit> {

    protected Integer weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Fruit o) {
        return this.weight - o.weight;
    }
}
