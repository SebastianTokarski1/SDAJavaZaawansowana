package enumerated;

public enum Size {
    SMALL, MEDIUM(10), BIG(20);

    int maxWeight;

    Size() {
        System.out.println("Tworze egzemplarz enum'a");
    }

    Size(int maxWeight) {
        this.maxWeight = maxWeight;
        System.out.println("Tworze egzemplarz enum'a o wadze " + maxWeight);
    }

    public int getMaxWeight() {
        return maxWeight + 2;
    }
}
