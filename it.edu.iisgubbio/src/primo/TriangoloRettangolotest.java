package primo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangoloRettangoloTest {

    TriangoloRettangolo ret = new TriangoloRettangolo(2, 3);

    @Test
    void testArea() {
        assertEquals(3, ret.calcolaArea(), "Regular area calculation");
    }
    
    @Test
    void testPerimetro() {
        double perimetroPrevisto = 2 + 3 + ret.calcolaIpotenusa();
        assertEquals(perimetroPrevisto, ret.calcolaPerimetro(), 1, "Regular perimeter calculation");
    }
}
