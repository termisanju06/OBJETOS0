package org.termi.objetos.highschool.readers;

import org.termi.objetos.highschool.model.Highschool;
import org.termi.objetos.highschool.model.Student;

import java.util.Scanner;

public class Highschoolreader {
    private final Scanner sc;

    public Highschoolreader(Scanner sc) {
        this.sc = sc;
    }
    public Student read() {
        System.out.println("Introduce tu nombre");
        String name = sc.nextLine();

        System.out.println("Introduce los estudiantes");
        System.out.println("Cuantos estudiantes hay");
 //       Student[] students = Student[];



        return ;
    }
}