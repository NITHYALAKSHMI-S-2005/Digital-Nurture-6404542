import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Exercise7Test {
    @Test
    public void testVoidMethodWithException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Failure")).when(mockApi).sendData("bad");
        MyService service = new MyService(mockApi);
        assertThrows(RuntimeException.class, () -> service.sendSomething("bad"));
        verify(mockApi).sendData("bad");
    }
}