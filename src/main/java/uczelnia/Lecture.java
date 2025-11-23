package uczelnia;

public class Lecture {
    private Course course;
    private double numberOfHours;
    private Student[] participants;

    public Lecture(Course course, double numberOfHours,  Student[] participants) {
        this.course = course;
        this.numberOfHours = numberOfHours;
        this.participants = participants;
    }

    public void showInfo(){
        System.out.println("Course Name: " + course.getName() + " Lecture length: " + numberOfHours + "\n Participants:");
        for (Student student : participants){
            student.showInfo();
        }
    }
}
