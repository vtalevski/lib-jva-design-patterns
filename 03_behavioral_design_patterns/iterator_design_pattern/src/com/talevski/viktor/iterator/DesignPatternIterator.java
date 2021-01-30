package com.talevski.viktor.iterator;

import com.talevski.viktor.model.DesignPattern;

public interface DesignPatternIterator {
    DesignPattern nextDesignPattern();

    boolean isLastDesignPattern();

}
