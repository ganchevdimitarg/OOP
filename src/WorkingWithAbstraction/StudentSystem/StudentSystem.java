package StudentSystem;

public class StudentSystem {
    private Repository repository;

    public StudentSystem() {
        this.repository = new Repository();
    }

    public void executeCommandWithArgs(String[] args) {
        if (args[0].equals("Create")) {
            createStudent(args);
        } else if (args[0].equals("Show")) {
            showStudent(args[1]);
        }
    }

    private void showStudent(String arg) {
        if (!repository.exists(arg)) {
            return;
        }

        Student student = repository.getByName(arg);

        System.out.println(student);
    }

    private void createStudent(String[] args) {
        String name = args[1];
        if (repository.exists(name)) {
            return;
        }
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);

        Student student = new Student(name, age, grade);
        repository.save(student);

    }
}
