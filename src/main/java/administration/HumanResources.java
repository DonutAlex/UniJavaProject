package administration;

import uczelnia.Lecturer;
import uczelnia.Mathematician;
import uczelnia.Poet;
import uczelnia.Student;

public class HumanResources {
    public static final int maxPeople = 100;

    public static int numberOfStudents = 0;
    public static int numberOfLectuers = 0;

    public static Lecturer[] lecturers = new Lecturer[maxPeople];
    public static Student[] students = new Student[maxPeople];

    public static double[] grades = {2, 3, 3.5, 4, 4.5, 5, 5.5};

    public static Lecturer[] getLecturers() {
        return lecturers;
    }

    public static Student[] getStudents() {
        return students;
    }

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

    public static void addPerson(int favouriteNumber, int experienceYears, String firstName, String lastname, int employeeNumber){
        if(numberOfLectuers < maxPeople) {
            lecturers[numberOfLectuers++] = new Mathematician(favouriteNumber, experienceYears, firstName, lastname, employeeNumber);
        }
    }

    public static void addPerson(String hatedAuthor, int expierienceYears, String firstName, String lastName, int employeeNumber){
        if(numberOfLectuers < maxPeople) {
            lecturers[numberOfLectuers++] = new Poet(hatedAuthor, expierienceYears, firstName, lastName, employeeNumber);
        }
    }

    public static void addPerson(Lecturer lecturer){
        if(numberOfLectuers < maxPeople) {
            lecturers[numberOfLectuers++] = lecturer;
        }
    }
}
