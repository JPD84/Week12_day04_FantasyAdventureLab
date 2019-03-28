import EnemyClass.Enemy;
import EnemyClass.Orc;
import Rooms.FightRoom;
import Warriors.Barbarian;
import Warriors.Warrior;
import Weapons.Claymore;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FightRoomTest {

    Barbarian barbarian;
    Claymore claymore;
    Orc orc;
    Club club;
    ArrayList<Warrior> warriors;
    ArrayList<Enemy> enemies;
    FightRoom fightRoom;


    @Before
    public void setup() {
        barbarian = new Barbarian("Conan", 40, 250, claymore);
        orc = new Orc("Ugg", 100, 15, club);
        warriors = new ArrayList<Warrior>(0);
        enemies = new ArrayList<Enemy>(0);
        fightRoom = new FightRoom(warriors, enemies);
    }

    @Test
    public void countWarriors() {
        assertEquals(0, fightRoom.countWarriors());
        assertEquals(0,fightRoom.countEnemies());

    }
}
