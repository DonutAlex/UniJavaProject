package uczelnia;

public class Course {
    private String name;
    private double numberOfHours;
    private Student[] participants;

    public String getName() {
        return name;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public Course(String name, double numberOfHours, Student[] participants) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.participants = participants;
    }

    public void showInfo(){
        System.out.println("Course Name: " + name + " Length: " + numberOfHours + "\n Participants:");
        for (Student student : participants){
            student.showInfo();
        }
    }
}
