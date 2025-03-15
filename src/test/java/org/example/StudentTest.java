package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void isDoingMBKM() {

        Student student1 = new Student("joko", 6, true);

        Assertions.assertTrue(student1.isDoingMBKM(student1.semester, student1.isActive), "tidak mbkm");
    }

    @Test
    void testEquals(){

        Student student1 = new Student("joko", 6, true);

        Assertions.assertEquals(true, student1.isDoingMBKM(student1.semester, student1.isActive), "sama");

    }
}