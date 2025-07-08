package han.aim.se.facade.with;

public class API {
    public boolean authenticate(String key) {
        if (key.equals("valid")) {
            System.out.println("API: authenticated");
            return true;
        } else {
            System.out.println("API: invalid key");
            return false;
        }
    }

    public Object findByPrimaryKey(int id) {
        return new Object();
    }

    public void alterObject(Object oldObject, Object newObject) {
        System.out.println("API: object altered");
    }
}
