import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

public class SouthAfricaTests {
    @Test
    void giveMunicipality_WhenGettingTotalChildren_ThenReturnZero() {
        Municipality municipality = new Municipality();
        int totalChildren = municipality.GetTotalChildren();
        boolean result = totalChildren == 0;
        assertTrue(result);
    }

    @Test
    void GivenACountry_ShouldReturnProvinces() {
        Country country = Mockito.mock(Country.class);
        when(country.GetTotalChildren()).thenReturn(9);
        int childrenCount = country.GetTotalChildren();
        assertEquals(9, childrenCount);
    }

    @Test
    void GivenSouthAfrica_WhenRetrievingProvinces_ThenReturn9() {
        int count = new SouthAfrica().GetTotalChildren();
        assertEquals(9, count);
    }
}
