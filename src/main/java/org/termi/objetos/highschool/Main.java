package org.termi.objetos.highschool;

import org.termi.objetos.highschool.readers.Studentreader;
import org.termi.objetos.highschool.readers.Highschoolreader;
import org.termi.objetos.highschool.model.Highschool;
import org.termi.objetos.highschool.model.Student;

import java.util.Scanner;
//NO ENTIENDO PORQUE FUNCIONA ESTO NI COMO ES QUE FUNCIONA
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Studentreader studentreader = new Studentreader(sc);
        Highschoolreader highschoolreader = new Highschoolreader(sc, studentreader);

        Highschool highschool = highschoolreader.read();

        System.out.println(highschool);
    }

}
