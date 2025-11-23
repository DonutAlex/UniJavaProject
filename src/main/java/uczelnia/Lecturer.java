package uczelnia;

public class Lecturer {
    private String firstName;
    private String lastName;
    private int employeeNumber;

    public Lecturer(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = index;
    }

    public void showInfo(){
        System.out.println("#" + employeeNumber + " First Name: " + firstName + " Last Name: " + lastName);
    }
}
