import EnemyClass.Orc;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {

    Orc orc;
    Club club;

    @Before
    public void before(){
        orc = new Orc("BawJaws", 150, 30, club);
    }

    @Test
    public void hasName(){
        assertEquals("BawJaws",orc.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(150,orc.getHealth());
    }

    @Test
    public void hasDamage(){
        assertEquals(30, orc.getDamage());
    }

    @Test
    public void setName(){
        orc.setName("FannyBaws");
        assertEquals("FannyBaws", orc.getName());
    }

    @Test
    public void setHealth(){
        orc.setHealth(170);
        assertEquals(170,orc.getHealth());
    }

}
