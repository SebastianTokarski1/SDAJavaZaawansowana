import fruits.Apple;

import java.util.Optional;

public class FlatMapMain {

    public static void main(String[] args) {
        processApple(new Apple(10));
        processApple(null);
        processApple(new Apple(20));
    }

    private static void processApple(Apple apple) {
        Optional<Apple> optionalApple = Optional.ofNullable(apple);
        Optional<Integer> optionalWeight = optionalApple.flatMap(a -> getWeight(a));
        Optional<Integer> optionalFilteredWeight = optionalWeight.filter(w -> w > 15);
        Optional<String> optionalMessage = optionalFilteredWeight.map(w -> "Waga: " + w);
        optionalMessage.ifPresent(System.out::println);
    }

    private static Optional<Integer> getWeight(Apple apple) {
        Optional<Integer> optionalValue = Optional.ofNullable(apple)
                .map(a -> a.getWeight() + 1);

        return optionalValue;
    }
}
