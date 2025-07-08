package han.aim.se.factorymethod.without;

// Base Message class
abstract class Message {
    public abstract void sendMessage();
}

// Email Message class
class EmailMessage extends Message {
    @Override
    public void sendMessage() {
        System.out.println("Sending Email Message");
    }
}

// SMS Message class
class SMSMessage extends Message {
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS Message");
    }
}

// Main class that uses different message types
public class Main {
    public static void main(String[] args) {
        String messageType = "Email";  // This can be "Email" or "SMS"

        Message message;

        // Does not adhere to Open-Closed Principle
        if (messageType.equals("Email")) {
            message = new EmailMessage();
        } else if (messageType.equals("SMS")) {
            message = new SMSMessage();
        } else {
            throw new IllegalArgumentException("Unknown message type");
        }

        message.sendMessage();
    }
}
