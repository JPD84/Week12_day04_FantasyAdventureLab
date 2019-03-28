import EnemyClass.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll("DunderHeid", 160, 40);
    }

    @Test
    public void getName(){
        assertEquals("DunderHeid",troll.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(160,troll.getHealth());
    }

    @Test
    public void getDamage(){
        assertEquals(40,troll.getDamage());
    }

    @Test
    public void setName(){
        troll.setName("Walloper");
        assertEquals("Walloper", troll.getName());
    }

    @Test
    public void setHealth(){
        troll.setHealth(180);
        assertEquals(180,troll.getHealth());

    }

    @Test
    public void setDamage(){
        troll.setDamage(50);
        assertEquals(50,troll.getDamage());
    }
}
