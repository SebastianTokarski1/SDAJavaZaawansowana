import animals.Cat;
import animals.Dog;
import animals.FastRunner;
import animals.Runner;

public class AnimalMain {

    public static void main(String[] args) {
        FastRunner runnerDog = new Dog("Ares");
        Runner runnerCat = new Cat("Mruczek");

        // runnerDog.runFaster();
        runnerDog.count();
        Runner.staticCount();

        Runner[] runners = new Runner[]{runnerDog, runnerCat};
        myStart(runners);
    }

    public static void myStart(Runner[] runners) {
        for (Runner runner : runners) {
            runner.run();
        }
    }
}
