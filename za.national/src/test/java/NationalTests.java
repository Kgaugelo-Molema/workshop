import org.junit.Test;
import org.mockito.Mockito;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class NationalTests {
    @Test
    public void ResponsibilityTest() {
        var responsible = Mockito.mock(Responsible.class);
        when(responsible.get()).thenReturn("Responsibility");
        var responsibility = responsible.get();
        assertNotNull(responsibility);
    }

    @Test
    public void LegislativeResponsibilityTest() {
        var responsibleLegislative = Mockito.mock(LegislativeResponsible.class);
        when(responsibleLegislative.get()).thenReturn("LegislativeResponsibility");
        var responsibility = responsibleLegislative.get();
        assertNotNull(responsibility);
    }

    @Test
    public void LegislativeResponsibilityImpTest() {
        boolean implementsLegislativeResponsibility = LegislativeResponsible.class.isAssignableFrom(LegislativeResponsibilityImpl.class);
        assertTrue(implementsLegislativeResponsibility);
        LegislativeResponsibilityImpl responsible = new LegislativeResponsibilityImpl();
        String result = responsible.get();
        assertEquals("LegislativeResponsibility", result);
    }
}
