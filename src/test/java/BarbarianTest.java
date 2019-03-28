import Warriors.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void setup(){
        barbarian = new Barbarian("Conan", 50, 250);
    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasAttackDamage() {
        assertEquals(50, barbarian.getAttackDamage());
    }

    @Test
    public void hashealth() {
        assertEquals(250, barbarian.getHealth());
    }

}
