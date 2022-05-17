import fruits.Apple;

import java.util.Optional;

public class OptionalFlatMap {

    public static void main(String[] args) {
        processApple(null);
        processApple(new Apple(20));
        processApple(new Apple(10));
    }

    public static void processApple(Apple apple) {
        Optional.ofNullable(apple)
                .map(a -> getHeavy(a))                      // Apple -> Optional<Integer>
                .map(o -> o.isPresent() ? o.get() : null)   // Optional<Integer> -> Integer
                .map(w -> "Waga jabłka: " + w)              // Integer -> String
                .ifPresent(System.out::println);

        Optional.ofNullable(apple)
                .flatMap(a -> getHeavy(a))                  // Apple -> Integer
                .map(w -> "Waga jabłka: " + w)              // Integer -> String
                .ifPresent(System.out::println);
    }

    public static Optional<Integer> getHeavy(Apple apple) {
        return Optional.ofNullable(apple)
                .map(a -> a.getWeight())
                .filter(w -> w > 15);
    }
}
