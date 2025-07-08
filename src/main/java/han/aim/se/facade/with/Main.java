package han.aim.se.facade.with;

public class Main {
    public static void main(String[] args) {
        APIGateway api = new APIGateway();

        // Access to API hidden behind a single method call
        // When APIGateway is provided by the server it saves the client
        // from having to know the details of the API and some performance
        api.alterObjectByIdInASecureWay("valid", 1, new Object());
    }
}
