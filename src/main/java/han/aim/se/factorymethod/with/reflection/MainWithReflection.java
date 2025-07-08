package han.aim.se.factorymethod.with.reflection;


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

// Factory class using reflection
class MessageFactory {

    // Method to create Message objects using class names
    public static Message createMessage(String className) {
        Message message = null;
        try {
            // Use reflection to dynamically load the class and instantiate it
            Class<?> clazz = Class.forName(className);
            message = (Message) clazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
        return message;
    }
}

// Main class
public class MainWithReflection {
    public static void main(String[] args) {
        // Full class names of the message types
        String messageType = "EmailMessage";  // This can be "EmailMessage" or "SMSMessage"

        // Use the factory method with reflection to create the message object
        Message message = MessageFactory.createMessage(messageType);

        if (message != null) {
            message.sendMessage();
        } else {
            System.out.println("Unknown message type");
        }
    }
}
