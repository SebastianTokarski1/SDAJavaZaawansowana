import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class ComparableMain {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("BMW", "e46"),
                new Car("Audi", "A7"),
                new Car("Fiat", "Punto")
        );

        Comparator<Car> comparator = Comparator.comparing(o -> o.getModel().toLowerCase(Locale.ROOT));

        cars.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}

class Car implements Comparable<Car> {
    private String company;
    private String model;

    public Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    @Override
    public int compareTo(Car o) {
        return company.compareTo(o.company);
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
