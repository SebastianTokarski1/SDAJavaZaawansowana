package animals;

public class Dog extends Animal implements FastRunner {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println(name + " hau hau");
    }

    @Override
    public void run() {
        System.out.println("Hop hop");
    }

    @Override
    public void runFaster() {
        System.out.println("Hop hop hop hop hop");
    }
}
