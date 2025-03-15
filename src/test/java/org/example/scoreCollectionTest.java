package org.example;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class scoreCollectionTest {

    @Test
    void testAvg() {

        scoreCollection sc = new scoreCollection();

        sc.addScore(1);
        sc.addScore(2);
        sc.addScore(3);

        Assertions.assertEquals(2, sc.averageScore(), "tidak sama");
    }

    @Test
    void testAdd(){
        scoreCollection sc = new scoreCollection();

        sc.addScore(1);
        sc.addScore(2);

        Assertions.assertEquals(2, sc.scores.size(), "tidak sama");
    }
}