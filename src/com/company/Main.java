package com.company;

import com.company.observers.Student;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Student s1 = new Student(teacher);
        Student s2 = new Student(teacher);
        Student s3 = new Student(teacher);

        teacher.setInform("Доброго дня!");
        teacher.NotifyObservers();

        teacher.setInform("До зустрічі");
        teacher.NotifyObservers();

        System.out.println("Git");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("How are you?");
        System.out.println("My favourite sport is football");
    }
}

