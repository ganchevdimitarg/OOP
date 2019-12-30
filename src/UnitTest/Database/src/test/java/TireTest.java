//import org.junit.Assert;
//import org.junit.Test;
//import org.mockito.Mockito;
//import p06_TirePressureMonitoringSystem.Alarm;
//import p06_TirePressureMonitoringSystem.Sensor;
//
//import java.lang.reflect.Field;
//
//public class TireTest {
//
//    @Test
//    public void alarmIsOnWhenPressureIsLessThenLower() throws NoSuchFieldException, IllegalAccessException {
//        Alarm alarm = new Alarm();
//
//        Sensor sensor = Mockito.mock(Sensor.class);
//        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(16.0);
//        Field field = Alarm.class.getDeclaredField("sensor");
//
//        field.setAccessible(true);
//        field.set(alarm,sensor);
//
//        alarm.check();
//        Assert.assertTrue(alarm.getAlarmOn());
//    }
//
//    @Test
//    public void alarmIsOnWhenPressureIsLessThenUpper() throws NoSuchFieldException, IllegalAccessException {
//        Alarm alarm = new Alarm();
//
//        Sensor sensor = Mockito.mock(Sensor.class);
//        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(21.0);
//        Field field = Alarm.class.getDeclaredField("sensor");
//
//        field.setAccessible(true);
//        field.set(alarm,sensor);
//
//        alarm.check();
//        Assert.assertTrue(alarm.getAlarmOn());
//    }
//}
