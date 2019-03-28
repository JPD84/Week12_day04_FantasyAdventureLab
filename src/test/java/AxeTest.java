import Weapons.Axe;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before(){
        axe = new Axe(50, 15);
    }

    @Test
    public void hasAttackDamage(){
        assertEquals(50,axe.getAttackDamage());
    }

    @Test
    public void hasDefence(){
        assertEquals(15, axe.getDefence());
    }

    @Test
    public void setAttackDamage(){
        axe.setAttackDamage(20);
        assertEquals(20, axe.getAttackDamage());
    }

    @Test
    public void setDefence(){
        axe.setDefence(25);
        assertEquals(25,axe.getDefence());
    }
}
