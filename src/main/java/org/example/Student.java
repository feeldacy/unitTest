package org.example;

public class Student {

    String name;
    int semester;
    boolean isActive;

    public Student(String name, int semester, boolean isActive){
        this.semester = semester;
        this.name = name;
        this.isActive = isActive;
    }

    boolean isDoingMBKM(int semester, boolean isActive){
        return semester >= 6 && isActive;
    }
}
