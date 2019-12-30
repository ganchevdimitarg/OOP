package fake;

import rpg_lab.Axe;
import rpg_lab.Target;

import static utils.Constants.BASIC_EXPERIENCE;

public class FakeTarget implements Target {


    public int getHealth() {
        return 0;
    }

    public void takeAttack(int attackPoints) {

    }

    public int giveExperience() {
        return BASIC_EXPERIENCE;
    }

    public boolean isDead() {
        return true;
    }

    public Axe getLoots() {
        return null;
    }
}
