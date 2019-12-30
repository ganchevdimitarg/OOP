//import fake.FakeTarget;
//import fake.FakeWeapon;
//import org.junit.Assert;
//import org.junit.Test;
//import org.mockito.Mockito;
//import rpg_lab.Axe;
//import rpg_lab.Hero;
//import rpg_lab.Target;
//
//import static utils.Constants.BASIC_EXPERIENCE;
//
//public class HeroTest {
//
//    @Test
//    public void shouldReceiveXPWhenTargetDies(){
//        Hero hero = new Hero("Ivan", new FakeWeapon());
//        Target target = new FakeTarget();
//
//        hero.attack(target);
//
//        Assert.assertEquals(BASIC_EXPERIENCE, hero.getExperience());
//    }
//
//    @Test
//    public void shouldGetLootsAfterKill(){
//        Axe loot = new FakeWeapon();
//        Hero hero = new Hero("Ivan", new FakeWeapon());
//        Target target = Mockito.mock(Target.class);
//        Mockito.when(target.isDead()).thenReturn(true);
//        Mockito.when(target.getLoots()).thenReturn(loot);
//
//        hero.attack(target);
//
//        Assert.assertEquals(loot, hero.getInventory().get(0));
//
//
//    }
//
//}
