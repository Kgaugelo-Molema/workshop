import org.junit.Test;
import org.mockito.Mockito;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class NationalTests {
    @Test
    public void ResponsibilityTest() {
        var responsible = Mockito.mock(Responsible.class);
        when(responsible.get()).thenReturn("Responsibility");
        var responsibility = responsible.get();
        assertNotNull(responsibility);
    }
}
