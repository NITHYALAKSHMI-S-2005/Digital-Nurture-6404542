import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Exercise3Test {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.process(anyString())).thenReturn("Processed");
        MyService service = new MyService(mockApi);
        assertEquals("Processed", service.handleInput("test input"));
        verify(mockApi).process(eq("test input"));
    }
}