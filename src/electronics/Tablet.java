package electronics;

public class Tablet extends Device implements EmailSender {

    public Tablet(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet " + model + " zostaje włączony");
    }

    @Override
    public void turnOff() {
        System.out.println("Tablet " + model + " zostaje wyłączony");
    }

    public void sendMessage(String type, String message) {
        System.out.printf("Wysyłam wiadomość typu %s z %s o wartości %s", type, model, message);
    }

    @Override
    public void sendEmail(String message) {
        sendMessage("email", message);
    }
}
