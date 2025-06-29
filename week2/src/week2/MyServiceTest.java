package week2;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
// Define a fake API
interface ExternalApi {
    String getData();
}

// Service that uses it
class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}

// Test class
public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock and test
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Verify result
        assertEquals("Mock Data", result);
    }
}
