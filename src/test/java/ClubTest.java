import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void setup(){
        club = new Club(10, 5);
    }

    @Test
    public void getAttackDamage() {
        assertEquals(10, club.getAttackDamage());
    }

    @Test
    public void getDefence() {
        assertEquals(5, club.getDefence());
    }
}
