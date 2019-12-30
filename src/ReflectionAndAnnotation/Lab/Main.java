package ReflectionAndAnnotation.Lab;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = Reflection.class;
        //взема типа на гласа
        System.out.println(clazz);

        //взема типа на супер класа
        System.out.println(clazz.getSuperclass());

        //показва колко интерфейса имплементира
        System.out.println(clazz.getInterfaces().length);

        //итерира по броя на интерфейсите и принтира имената
        Class[] clazzInterfations= clazz.getInterfaces();
        for (Class interfation : clazzInterfations) {
            System.out.println(interfation);
        }

        //итерира по броя на конспрукторите и ги принтира
        Constructor[] ref = clazz.getDeclaredConstructors();
        for (Constructor constructor : ref) {
            System.out.println(constructor);
        }

        Method[] method = clazz.getDeclaredMethods();
        TreeSet<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));
        TreeSet<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));

        for (Method method1 : method) {
            if (method1.getName().contains("get")){
                if (method1.getParameterCount() == 0){
                    getters.add(method1);
                }
            } else if (method1.getName().contains("set")){
                if (method1.getParameterCount() == 1){
                    if (void.class.equals(method1.getReturnType()))
                    setters.add(method1);
                }
            }
        }

        for (Method getter : getters) {
            System.out.printf("%s will return %s%n", getter.getName(), getter.getReturnType());
        }

        for (Method setter : setters) {
            System.out.printf("%s and will set field of %s%n", setter.getName(), Arrays.toString(setter.getParameterTypes()));
        }

        System.out.println("•\tFields");
        Arrays.stream(clazz.getDeclaredFields()).filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(e -> System.out.println(e.getName() + " have to be private!"));
        System.out.println("•\tGetters");
        getters.stream().filter(g -> !Modifier.isPublic(g.getModifiers())).forEach(e -> System.out.println(e.getName() + " have to be public!"));
        System.out.println("•\tSetters");
        setters.stream().filter(s -> !Modifier.isPrivate(s.getModifiers())).forEach(e -> System.out.println(e.getName() + " have to be private!"));

        Annotation[] annotations = clazz.getDeclaredAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        Method getName = clazz.getDeclaredMethod("getName");

        Author author = getName.getAnnotation(Author.class);

        System.out.println(author.name());
    }
}
