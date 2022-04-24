package electronics;

public class Radio extends Device {

    public Radio(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("Radio " + model + " zaczyna grać");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio " + model + " przestaje grać");
    }

    public void changeChannel(String channel) {
        System.out.println("Radio " + model + " zmienia kanał na " + channel);
    }
}
