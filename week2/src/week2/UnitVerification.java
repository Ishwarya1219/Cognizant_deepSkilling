package week2;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import org.junit.Test;
public class UnitVerification {

	public class MyServiceTest {

	    @Test
	    public void testVerifyInteraction() {
	        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
	        MyService service = new MyService(mockApi);

	        service.fetchData();

	        // ✅ Verifies that getData() was called
	        verify(mockApi).getData();
	    }
	}


}
