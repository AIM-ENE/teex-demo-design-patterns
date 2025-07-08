package han.aim.se.state.without;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Fan fan = new Fan();
        fan.request(); // Turns on low
        Thread.sleep(1000);
        fan.request(); // Turns on medium
        Thread.sleep(1000);
        fan.request(); // Turns on high
        Thread.sleep(1000);
        fan.request(); // Turns off
    }
}
