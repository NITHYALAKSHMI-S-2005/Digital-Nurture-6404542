import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class Exercise6Test {
    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.callInOrder();
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).firstCall();
        inOrder.verify(mockApi).secondCall();
    }
}