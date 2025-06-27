import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Exercise4Test {
    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).sendData(anyString());
        MyService service = new MyService(mockApi);
        service.sendSomething("hello");
        verify(mockApi).sendData("hello");
    }
}