public interface ExternalApi {
    String getData();
    void sendData(String data);
    String process(String input);
    void firstCall();
    void secondCall();
}