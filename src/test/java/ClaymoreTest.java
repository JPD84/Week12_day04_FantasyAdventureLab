import Weapons.Claymore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClaymoreTest {

    Claymore claymore;

    @Before
    public void setup(){
        claymore = new Claymore(30, 10);
    }

    @Test
    public void hasAttackDamage() {
        assertEquals(30, claymore.getAttackDamage());
    }

    @Test
    public void hasDefense() {
        assertEquals(10, claymore.getDefence());
    }
}
