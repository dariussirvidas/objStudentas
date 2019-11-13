package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int id = 0;
        Studentas[] studentai = new Studentas[5];
        studentai[0] = new Studentas(++id, "Jonas", "Jonaitis", "T-19");
        studentai[1] = new Studentas(++id, "Petras", "Petraitis", "T-19");
        studentai[2] = new Studentas(++id, "Antanas", "Antanaitis", "T-19");
        studentai[3] = new Studentas(++id, "Giedrė", "Giedraitė", "T-19");
        studentai[4] = new Studentas(++id, "Dalia", "Grybauskaitė", "T-19");
        for (Studentas stud:studentai) {
            System.out.println(stud);
        }
        System.out.println("--------------------------------------");
        studentai[0].setGrupe("Net-19");
        System.out.println(studentai[0]);
        studentai[1].setPavarde("Jonaitis");
        System.out.println(studentai[1]);
        studentai[2].setVardas("Žygimantas");
        System.out.println(studentai[2]);
    }
}
