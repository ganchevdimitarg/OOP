package Mankind;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String fistName, String lastName, double weekSalary, double workHoursPerDay) {
        super(fistName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    @Override
    protected void setLastName(String lastName){
        if (lastName.length() <= 3){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
    }

    public double getWeekSalary() {
        return this.weekSalary;
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10.0){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public double getWorkHoursPerDay() {
        return this.workHoursPerDay;
    }

    private void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay < 1 || workHoursPerDay > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    public double salaryPerHour(){
        return (this.getWeekSalary() / 7) / this.getWorkHoursPerDay();
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%n" +
                "Last Name: %s%n" +
                "Week Salary: %.2f%n" +
                "Hours per day: %.2f%n" +
                "Salary per hour: %.2f%n",
                super.getFistName(), super.getLastName(), this.getWeekSalary(), this.getWorkHoursPerDay(), salaryPerHour());
    }
}
