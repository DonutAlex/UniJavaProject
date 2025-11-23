package uczelnia;

public class Student {
    private String firstName;
    private String lastName;
    private int indexNumber;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = index;
    }

    public void showInfo(){
        System.out.println("#" + indexNumber + " First Name: " + getFirstName() + " Last Name: " + getLastName());
    }
}
