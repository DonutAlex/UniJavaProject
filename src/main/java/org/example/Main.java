package org.example;

import administration.HumanResources;
import uczelnia.Lecturer;
import uczelnia.Student;

public class Main {
    static void main() {
        HumanResources.addPerson("Grzegorz", "Braun", 1, true);
        HumanResources.addPerson("Małgorzata", "Braun", 2, true);

        HumanResources.addPerson("Fryderyk", "Fazmiś", 1, false);
        HumanResources.addPerson("Włodzimierz", "Biały", 2, false);
        HumanResources.addPerson("Grzegorz", "Ciekawy", 1, false);

        System.out.println("Wykładowcy:");
        for(int i=0; i< HumanResources.numberOfLectuers; i++){
            HumanResources.lecturers[i].showInfo();
        }

        System.out.println("Uczniowie:");
        for(int i=0; i< HumanResources.numberOfStudents; i++){
            HumanResources.students[i].showInfo();
        }
    }
}
