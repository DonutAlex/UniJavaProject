package administration;

import uczelnia.Course;
import uczelnia.Lecture;
import uczelnia.Student;
import java.util.List;

public class Evaluation {
    public static List<Course> courses;
    public static List<Lecture> lectures;

    private static boolean[][] result;

    public static void addCourse(Course course){
        courses.add(course);
    }

    public static void addLecture(Lecture lecture){
        lectures.add(lecture);
    }

    public static List<Course> getCourseData(){
        return courses;
    }

    public static List<Lecture> getLecturesData(){
        return lectures;
    }

    public static void fillResult() {
        int liczbaKursow = courses.size();
        int liczbaStudentow = HumanResources.numberOfStudents;
        Student[] tempStudents = HumanResources.students;
        result = new boolean[liczbaKursow][liczbaStudentow];

        for (int indeksKursu = 0; indeksKursu < liczbaKursow; indeksKursu++) {
            Course tempCourse = courses.get(indeksKursu);

            for (int indeksStudenta = 0; indeksStudenta < liczbaStudentow; indeksStudenta++) {
                int attendence = 0;
                Student tempStudent = tempStudents[indeksStudenta];

                for (Lecture lecture : lectures) {
                    if (lecture.getCourse() == tempCourse) {
                        for (Student participant : lecture.getParticipants()) {
                            if (participant == tempStudent) {
                                attendence += lecture.getNumberOfHours();
                                break;
                            }
                        }
                    }
                }

                if (attendence >= tempCourse.getNumberOfHours()) {
                    result[indeksKursu][indeksStudenta] = true;
                }
            }
        }


    }

    public static void printResult() {
        int liczbaKursow = courses.size();
        int liczbaStudentow = HumanResources.numberOfStudents;
        Student[] tempStudents = HumanResources.students;

        for (int indeksKursu = 0; indeksKursu < liczbaKursow; indeksKursu++) {
            Course tempCourse = courses.get(indeksKursu);
            System.out.println(tempCourse.getName());

            for (int indeksStudenta = 0; indeksStudenta < liczbaStudentow; indeksStudenta++) {
                Student tempStudent = tempStudents[indeksStudenta];
                System.out.print(tempStudent.getFirstName() + " " + tempStudent.getLastName() + " - ");

                if (result[indeksKursu][indeksStudenta]){
                    System.out.print("pass");
                }
                else{
                    System.out.print("fail");
                }
            }
        }
    }
}
