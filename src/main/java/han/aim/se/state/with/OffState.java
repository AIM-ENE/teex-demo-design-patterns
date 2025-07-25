package han.aim.se.state.with;

class OffState implements FanState {
    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan turned on low.");
        fan.setState(new LowState());
    }
}
