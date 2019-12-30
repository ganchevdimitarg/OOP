//package pr02PrivateClassFiddling;
//
//import pr02PrivateClassFiddling.com.BlackBoxInt;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, NoSuchFieldException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] tokens = reader.readLine().split("_");
//
//        //създаване на инстанция от класа
//         Constructor<BlackBoxInt> constructor = BlackBoxInt.class.getDeclaredConstructor();
//
//         constructor.setAccessible(true);
//
//         BlackBoxInt blackBoxInt = constructor.newInstance();
//
//         //взема всичик методи то класа
//         Method[] methods = blackBoxInt.getClass().getDeclaredMethods();
//
//         //вземаш полето с това име
//         Field innerValue = blackBoxInt.getClass().getDeclaredField("innerValue");
//         innerValue.setAccessible(true);
//
//        while (!tokens[0].equalsIgnoreCase("end")) {
//            String command = tokens[0];
//            int value = Integer.parseInt(tokens[1]);
//
//            //взема го като метод
//            Method method = Arrays.stream(methods).filter(m -> m.getName().equalsIgnoreCase(command))
//                    .findFirst().orElse(null);
//            //аго е прайват
//            method.setAccessible(true);
//            //използваш метода (върху кой обект, какъв да е аркоментна )
//            method.invoke(blackBoxInt, value);
//
//            //печата стойността на полето
//            System.out.println(innerValue.get(blackBoxInt));
//
//            tokens = reader.readLine().split("_");
//        }
//    }
//}
