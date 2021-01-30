package com.talevski.viktor.model;

public class Ink { // This is the adaptee that is incompatible with the target.
    public void write(String content) {
        System.out.println(content);
    }
}
