package electronics;

public class Phone extends Device implements EmailSender {

    private String number;

    public Phone(String model, String number) {
        super(model);
        this.number = number;
    }

    @Override
    public void turnOn() {
        System.out.println("Podświetlamy ekran telefonu " + model);
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączamy ekran telefonu " + model);
    }

    public void makeCall(String number) {
        System.out.println("Telefon " + model + " dzwoni do " + number);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Wysyłamy maila z telefonu " + model + " o wartości " + message);
    }
}
