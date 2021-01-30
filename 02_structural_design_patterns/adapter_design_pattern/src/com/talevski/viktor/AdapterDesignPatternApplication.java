package com.talevski.viktor;

import com.talevski.viktor.adapter.Pen;
import com.talevski.viktor.model.Homework;
import com.talevski.viktor.model.Ink;

/**
 * Reference link for the Adapter Design Pattern from Spring Framework Guru - 'https://springframework.guru/gang-of-four-design-patterns/adapter-pattern'.
 * Reference link for the Adapter Design Pattern from YouTube - 'https://www.youtube.com/watch?v=Y7DYhe6efQY'.
 */
public class AdapterDesignPatternApplication {
    public static void main(String[] args) {
        Ink ink = new Ink();
        Pen pen = new Pen();
        pen.setInk(ink);

        Homework homework = new Homework();
        homework.setPen(pen);
        homework.write("Homework solution.");
    }
}
