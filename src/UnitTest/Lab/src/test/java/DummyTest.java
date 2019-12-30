//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import rpg_lab.DummyImpl;
//
//import static utils.Constants.*;
//
//public class DummyTest {
//
//    private DummyImpl aliveDummy;
//    private DummyImpl deadDummy;
//
//    @Before
//    public void createAliveDummy(){
//        this.aliveDummy = new DummyImpl(BASIC_HEALTH, BASIC_EXPERIENCE);
//    }
//
//    @Before
//    public void createDeadDummy(){
//        this.deadDummy = new DummyImpl(DEAD_DUMMY_HEALTH, BASIC_EXPERIENCE);
//    }
//
//    @Test
//    public void shouldLosesHealthIfAttacked() {
//        aliveDummy.takeAttack(BASIC_ATTACK_POINTS);
//
//        Assert.assertEquals(BASIC_HEALTH - BASIC_ATTACK_POINTS, aliveDummy.getHealth());
//    }
//
//    @Test(expected = IllegalStateException.class)
//    public void shouldThrowsExceptionWhenDummyDeadOnAttacked() {
//        deadDummy.takeAttack(BASIC_ATTACK_POINTS);
//    }
//
//    @Test
//    public void shouldShowExperienceWhenDummyIsDead() {
//        int actual = deadDummy.giveExperience();
//
//        Assert.assertEquals(10, actual);
//    }
//
//    @Test(expected = IllegalStateException.class)
//    public void shouldDontExperienceWhenDummyIsAlive() {
//        aliveDummy.giveExperience();
//    }
//}
