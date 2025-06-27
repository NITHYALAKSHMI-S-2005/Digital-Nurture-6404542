public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void sendSomething(String message) {
        api.sendData(message);
    }

    public String handleInput(String input) {
        return api.process(input);
    }

    public void callInOrder() {
        api.firstCall();
        api.secondCall();
    }
}