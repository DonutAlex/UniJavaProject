package org.example;

import administration.HumanResources;
import administration.Evaluation;
import uczelnia.*;

import java.util.List;

public class Main {
    static void main() {
        HumanResources.addPerson("Grzegorz", "Braun", 1, true);
        HumanResources.addPerson("Małgorzata", "Braun", 2, true);

        HumanResources.addPerson("Fryderyk", "Fazmiś", 1, false);
        HumanResources.addPerson("Włodzimierz", "Biały", 2, false);
        HumanResources.addPerson("Grzegorz", "Ciekawy", 3, false);

        HumanResources.addPerson(15, 4, "Adam", "Małysz", 3);
        HumanResources.addPerson("public", 4, "Karol", "Wojtyła", 4);

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

        Homework homework = new Homework();

        if (HumanResources.lecturers[2] instanceof ExperiencedLecturer)
        {
            ExperiencedLecturer m = (ExperiencedLecturer) HumanResources.lecturers[2];
            homework = m.createHomework("Matma", "Matmama", 12);
        }

        SolvedHomework solvedHomework = HumanResources.getStudents()[0].solveHomework(homework, "public class");

        for (Lecturer lecturer : HumanResources.getLecturers()) {

            if (lecturer instanceof ExperiencedLecturer) {

                ExperiencedLecturer experiencedLecturer;
                experiencedLecturer = (ExperiencedLecturer) lecturer;

                GradedHomework ocena = experiencedLecturer.gradeHomework(solvedHomework);

                System.out.println("Oceniający: ");
                experiencedLecturer.showInfo();
                System.out.println("Ocena: " + ocena.getGrade());

                if(lecturer instanceof IsThesisGradable){
                    System.out.println(((IsThesisGradable) lecturer).gradeThesis(solvedHomework.getSolution()));
                }
            }
        }


    }
}
