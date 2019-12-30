package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String modifier = reader.readLine();
//        List<Field> modifiers = new ArrayList<>();

        //взема всички полета от класа
        Field[] fields = RichSoilLand.class.getDeclaredFields();
        //за принтиране
        Consumer<Field> printer = f -> System.out.printf("%s %s %s%n", Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName());

        while (!modifier.equalsIgnoreCase("harvest")) {

            //взема полетат и ги филтрира по търсения дума
            String finalModifier = modifier;
            Field[] requestedFields = Arrays.stream(fields).filter(f ->
                    Modifier.toString(f.getModifiers()).equalsIgnoreCase(finalModifier))
                    .toArray(Field[]::new);

            if (requestedFields.length != 0){
                Arrays.stream(requestedFields).forEach(printer);
            } else {
                Arrays.stream(fields).forEach(printer);
            }
//            Field[] allField = RichSoilLand.class.getDeclaredFields();
//            switch (modifier) {
//                case "all":
//                    modifiers.addAll(Arrays.asList(allField));
//                    break;
//                case "private":
//                    for (Field field : allField) {
//                        if (Modifier.isPrivate(field.getModifiers())) {
//                            modifiers.add(field);
//                        }
//                    }
//                    break;
//                case "public":
//                    for (Field field : allField) {
//                        if (Modifier.isPublic(field.getModifiers())) {
//                            modifiers.add(field);
//                        }
//                    }
//                    break;
//                case "protected":
//                    for (Field field : allField) {
//                        if (Modifier.isProtected(field.getModifiers())) {
//                            modifiers.add(field);
//                        }
//                    }
//                    break;
//            }

            modifier = reader.readLine();
        }

//        for (Field field : modifiers) {
//            System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
//        }
    }
}
