package han.aim.se.facade.without;

public class Main {
    public static void main(String[] args) {
        API api = new API();

        // Three subsystem calls to authenticate, findByPrimaryKey, and alterObject
        api.authenticate("valid");
        Object o = api.findByPrimaryKey(1);
        api.alterObject(o, new Object());
    }
}
