package StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        String nameStudent = String.format("%s is %d years old. ", this.getName(), this.getAge());

        return nameStudent + getGrateString();
    }

    private String getGrateString() {
        if (this.getGrade() >= 5.00) {
            return "Excellent student.";
        } else if (this.getGrade() < 5.00 && this.getGrade() >= 3.50) {
            return "Average student.";
        }
        return "Very nice person.";
    }
}
