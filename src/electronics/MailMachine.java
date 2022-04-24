package electronics;

public class MailMachine implements EmailSender {

    private static final int MAX_ELEMENTS = 3;
    private EmailSender[] emailSenders = new EmailSender[MAX_ELEMENTS];
    private int counter = 0;

    public void addEmailSender(EmailSender emailSender) {
        if (counter > MAX_ELEMENTS - 1) {
            System.out.println("Nie można dodać kolejnego email sender'a");
        }
        emailSenders[counter] = emailSender;
        counter++;
        System.out.println("Dodano kolejny email sender");
    }

    @Override
    public void sendEmail(String message) {
        for (EmailSender emailSender : emailSenders) {
            emailSender.sendEmail(message);
        }
    }
}
