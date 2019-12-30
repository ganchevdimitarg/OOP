package fake;

import rpg_lab.Axe;
import rpg_lab.Target;

import static utils.Constants.BASIC_ATTACK;

public class FakeWeapon implements Axe {

    public void attack(Target target) {}

    public int getAttackPoints() {
        return BASIC_ATTACK;
    }

    public int getDurabilityPoints() {
        return 0;
    }
}
