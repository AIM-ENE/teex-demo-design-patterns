package han.aim.se.state.with;

class LowState implements FanState {
    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan turned on medium.");
        fan.setState(new MediumState());
    }
}
