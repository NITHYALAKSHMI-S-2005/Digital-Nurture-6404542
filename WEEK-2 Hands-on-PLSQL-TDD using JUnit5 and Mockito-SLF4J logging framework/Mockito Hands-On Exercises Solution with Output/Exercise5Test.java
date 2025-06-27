import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Exercise5Test {
    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("First Call", "Second Call");
        MyService service = new MyService(mockApi);
        assertEquals("First Call", service.fetchData());
        assertEquals("Second Call", service.fetchData());
    }
}