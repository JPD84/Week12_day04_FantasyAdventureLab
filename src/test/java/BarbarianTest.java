import Warriors.Barbarian;
import Weapons.Claymore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Claymore claymore;

    @Before
    public void setup(){
        barbarian = new Barbarian("Conan", 50, 250, claymore);
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
