import animals.*;

public class AnimalMain {

    public static void main(String[] args) {
        FastRunner runnerDog = new Dog("Ares");
        Runner runnerCat = new Cat("Mruczek");

        // runnerDog.runFaster();
        runnerDog.count();
        Runner.staticCount();

        Runner[] runners = new Runner[]{runnerDog, runnerCat};
        myStart(runners);

        if (runnerDog instanceof Dog) {
            System.out.println("To jest pies");
            Dog dog = (Dog) runnerDog;
            dog.saySomething();
        }


        Animal animal = new Animal("Ślimak Romek") {
            @Override
            public void saySomething() {
                System.out.println("...");
            }
        };

        Runner runner = new Runner() {
            @Override
            public void run() {
                System.out.println("A ja chodzę...");
            }
        };

        animal.saySomething();
        runner.run();
    }

    public static void myStart(Runner[] runners) {
        for (Runner runner : runners) {
            runner.run();
        }
    }
}
