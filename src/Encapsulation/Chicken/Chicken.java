////package ClassBox;
//
//public class Chicken {
//    private String name;
//    private int age;
//
//    public Chicken(String name, int age) {
//        this.setName(name);
//        this.setAge(age);
//    }
//
//    private void setName(String name) {
//        if (name.length() == 0 || name.equals(" ") || name.isEmpty()) {
//            throw new IllegalArgumentException("Name cannot be empty.");
//        }
//        this.name = name;
//    }
//
//    private void setAge(int age) {
//        if (age < 0 || age > 15){
//            throw new IllegalArgumentException("Age should be between 0 and 15.");
//        }
//            this.age = age;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public double productPerDay() {
//        return calculateProductPerDay();
//    }
//
//    private double calculateProductPerDay() {
//        double product;
//        if (this.getAge() < 6){
//            product = 2;
//        } else if (this.getAge() >=6 && this.getAge() <= 11){
//            product = 1;
//        } else {
//            product = 0.75;
//        }
//        return product;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Chicken %s (age %.2f) can produce 1 eggs per day.", this.getName(), this.productPerDay());
//    }
//}
