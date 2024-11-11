package com.ex;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = Student.getBuilder()
                          .firstName("Khan")
                          .build();
        Student student2 = Student.getBuilder()
                          .firstName("Karim")
                          .middleName("Bnm")
                          .build();
        Student student3 = Student.getBuilder()
                           .firstName("Karim")
                           .middleName("bnm")
                           .lastName("Jkl")
                           .build();
        Student st = Student.getBuilder()
                             
                             .lastName("bonch")
                             .firstName("karim")
                             .build();
        System.out.println(st.toString());


        System.out.println(student.toString1());
        System.out.println(student.toString2());
        System.out.println(student.toString3());
    }
}