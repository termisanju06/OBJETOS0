package org.termi.objetos.highschool.readers;

import org.termi.objetos.highschool.model.Highschool;
import org.termi.objetos.highschool.model.Student;

import java.util.Scanner;

public class Highschoolreader {
    private final Scanner sc;
    private final Studentreader studentreader;

    public Highschoolreader(Scanner sc, Studentreader studentreader) {
        this.sc = sc;
        this.studentreader = studentreader;

    }
    public Highschool read() {
        System.out.println("Introduce tu nombre");
        String name = sc.nextLine();

        System.out.println("Cuantos estudiantes hay");
        int a = sc.nextInt();
        System.out.println("Introduce los estudiantes");
        Student[] students = new Student[a];
        for (int i = 0;i<a;i++){
            students[i] = studentreader.read();
        }

//        Highschool highschool = new Highschool(name,students);
        return new Highschool(name,students);
    }
}