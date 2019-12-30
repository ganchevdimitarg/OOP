package Mankind;

public class Human {
    private String fistName;
    private String lastName;

    public Human(String fistName, String lastName) {
        this.setFistName(fistName);
        this.setLastName(lastName);
    }

    public String getFistName() {
        return this.fistName;
    }

    private void setFistName(String fistName) {
        isNameFirstLetter(fistName);
        if (fistName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.fistName = fistName;
    }

    public String getLastName() {
        return this.lastName;
    }

    protected void setLastName(String lastName) {
        isNameFirstLetter(lastName);
        if (fistName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName = lastName;
    }


    private void isNameFirstLetter(String name) {
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: " + name);
        }
    }
}
