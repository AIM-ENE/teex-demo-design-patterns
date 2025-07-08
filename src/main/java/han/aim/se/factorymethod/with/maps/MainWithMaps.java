package han.aim.se.factorymethod.with.maps;

import java.util.HashMap;
import java.util.Map;

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

// Abstract Factory class
abstract class MessageFactory {
    public abstract Message createMessage();
}

// Concrete Factory for Email
class EmailMessageFactory extends MessageFactory {
    @Override
    public Message createMessage() {
        return new EmailMessage();
    }
}

// Concrete Factory for SMS
class SMSMessageFactory extends MessageFactory {
    @Override
    public Message createMessage() {
        return new SMSMessage();
    }
}

// Main class with Factory Registry
public class MainWithMaps {

    private static final Map<String, MessageFactory> messageFactoryMap = new HashMap<>();

    // Static block to initialize and register factories
    static {
        messageFactoryMap.put("Email", new EmailMessageFactory());
        messageFactoryMap.put("SMS", new SMSMessageFactory());
    }

    public static void main(String[] args) {
        String messageType = "Email";  // This can be "Email" or "SMS"

        MessageFactory factory = messageFactoryMap.get(messageType);

        if (factory == null) {
            throw new IllegalArgumentException("Unknown message type");
        }

        Message message = factory.createMessage();
        message.sendMessage();
    }
}
