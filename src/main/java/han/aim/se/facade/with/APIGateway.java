package han.aim.se.facade.with;

public class APIGateway {
    private API api;

    public APIGateway() {
        this.api = new API();
    }

    public void alterObjectByIdInASecureWay(String key, int id, Object newObject) {
        api.authenticate(key);
        var o = api.findByPrimaryKey(id);
        api.alterObject(o, newObject);
    }
}
