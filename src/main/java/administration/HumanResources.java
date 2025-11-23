package administration;

import uczelnia.Lecturer;
import uczelnia.Student;

public class HumanResources {
    public static final int maxPeople = 100;

    public static int numberOfStudents = 0;
    public static int numberOfLectuers = 0;

    public static Lecturer[] lecturers = new Lecturer[maxPeople];
    public static Student[] students = new Student[maxPeople];

    public static double[] grades = {2, 3, 3.5, 4, 4.5, 5, 5.5};

    public static void addPerson(String firstName, String lastName, int number, boolean isLecturer) {
        if(isLecturer) {
            if(numberOfLectuers < maxPeople) {
                lecturers[numberOfLectuers++] = new Lecturer(firstName, lastName, number);
            }
        }
        else{
            if(numberOfStudents < maxPeople) {
                students[numberOfStudents++] = new Student(firstName, lastName, number);
            }
        }
    }
}
