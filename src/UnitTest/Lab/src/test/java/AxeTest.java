//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import rpg_lab.Axe;
//import rpg_lab.AxeImpl;
//import rpg_lab.DummyImpl;
//
//import static utils.Constants.*;
//
//public class AxeTest {
//
//    private DummyImpl target;
//
//    @Before
//    public void createDummy(){
//        this.target = new DummyImpl(BASIC_HEALTH, BASIC_EXPERIENCE);
//    }
//
//    @Test
//    public void shouldLosesDurabilityAfterAttack(){
//        AxeImpl axe = new AxeImpl(BASIC_ATTACK, BASIC_DURABILITY);
//
//        axe.attack(target);
//
//        Assert.assertEquals("Dummy didn't loses durability after attack",BASIC_DURABILITY - 1, axe.getDurabilityPoints());
//    }
//
//    @Test(expected = IllegalStateException.class)
//    public void shouldThrowException(){
//        AxeImpl axe = new AxeImpl(BASIC_ATTACK, -BASIC_DURABILITY);
//
//        axe.attack(target);
//    }
//}
