package Mankind;

public class Student extends Human {
    private String facultyNumber;

    public Student(String fistName, String lastName, String facultyNumber) {
        super(fistName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return this.facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) {
        if (Integer.parseInt(facultyNumber) < 5 || Integer.parseInt(facultyNumber) > 10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nFaculty number: %s%n",
                super.getFistName(), super.getLastName(), this.getFacultyNumber());
    }
}
