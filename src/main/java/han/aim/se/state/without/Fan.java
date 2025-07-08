package han.aim.se.state.without;


enum FanState {
    OFF, LOW, MEDIUM, HIGH
}

public class Fan {
    private FanState currentState;

    public Fan() {
        this.currentState = FanState.OFF;
    }

    public void request() {
        switch (currentState) {
            case OFF:
                System.out.println("Fan turned on low.");
                currentState = FanState.LOW;
                break;
            case LOW:
                System.out.println("Fan turned on medium.");
                currentState = FanState.MEDIUM;
                break;
            case MEDIUM:
                System.out.println("Fan turned on high.");
                currentState = FanState.HIGH;
                break;
            case HIGH:
                System.out.println("Fan turned off.");
                currentState = FanState.OFF;
                break;

        }
    }
}

