package org.termi.objetos.highschool.readers;

import org.termi.objetos.highschool.model.Student;

import java.util.Scanner;

public class Studentreader {
    private final Scanner sc;

    public Studentreader(Scanner sc) {
        this.sc = sc;
    }
    public Student read() {
        System.out.println("Dame tu nombre");
        String name = sc.nextLine();

        System.out.println("Dame tu apellido");
        String surname = sc.nextLine();

        System.out.println("Dame tu dirección");
        String address = sc.nextLine();

//        Student student = new Student(name,surname,address);
        return new Student(name,surname,address);
    }
}
