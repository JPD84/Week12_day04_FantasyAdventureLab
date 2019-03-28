import Weapons.KnightSword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightSwordTest {

    KnightSword knightsword;

    @Before
    public void setup(){
        knightsword = new KnightSword(15, 10);
    }

    @Test
    public void hasAttackDamage() {
        assertEquals(15, knightsword.getAttackDamage());
    }

    @Test
    public void name() {
        assertEquals(10, knightsword.getDefence());
    }


}
