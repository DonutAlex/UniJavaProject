package org.example;

import administration.HumanResources;
import administration.Evaluation;
import uczelnia.Course;
import uczelnia.Lecture;
import uczelnia.Lecturer;
import uczelnia.Student;
import java.util.List;

public class Main {
    static void main() {
        HumanResources.addPerson("Grzegorz", "Braun", 1, true);
        HumanResources.addPerson("Małgorzata", "Braun", 2, true);

        HumanResources.addPerson("Fryderyk", "Fazmiś", 1, false);
        HumanResources.addPerson("Włodzimierz", "Biały", 2, false);
        HumanResources.addPerson("Grzegorz", "Ciekawy", 3, false);

        System.out.println("Wykładowcy:");
        for(int i=0; i< HumanResources.numberOfLectuers; i++){
            HumanResources.lecturers[i].showInfo();
        }

        System.out.println("Uczniowie:");
        for(int i=0; i< HumanResources.numberOfStudents; i++){
            HumanResources.students[i].showInfo();
        }

        Evaluation.addCourse(new Course("Matematyka", 5,
                new Student[] {
                        HumanResources.students[0],
                        HumanResources.students[1]})
        );

        Evaluation.addLecture(new Lecture(Evaluation.courses.getFirst(), 2,
                new Student[] {
                        HumanResources.students[0],
                        HumanResources.students[1]})
        );

        Evaluation.addLecture(new Lecture(Evaluation.courses.getFirst(), 4,
                new Student[] {
                        HumanResources.students[0]})
        );


        Evaluation.addCourse(new Course("J. Polski", 5,
                new Student[] {
                        HumanResources.students[0],
                        HumanResources.students[2]})
        );

        Evaluation.addLecture(new Lecture(Evaluation.courses.get(1), 2,
                new Student[] {
                        HumanResources.students[0],
                        HumanResources.students[2]})
        );

        Evaluation.addLecture(new Lecture(Evaluation.courses.get(1), 4,
                new Student[] {
                        HumanResources.students[2]})
        );


        Evaluation.fillResult();
        Evaluation.printResult();
    }
}
