package com.talevski.viktor.iterator;

import com.talevski.viktor.model.DesignPattern;

import java.util.List;

public class DesignPatternIteratorImpl implements DesignPatternIterator {
    public List<DesignPattern> designPatterns;
    Integer designPatternPosition = 0;
    DesignPattern designPattern;

    public DesignPatternIteratorImpl(List<DesignPattern> designPatterns) {
        this.designPatterns = designPatterns;
    }

    @Override
    public DesignPattern nextDesignPattern() {
        System.out.println("Design pattern at position - '" + designPatternPosition + "'.");
        designPattern = designPatterns.get(designPatternPosition);
        designPatternPosition = designPatternPosition + 1;
        return designPattern;
    }

    @Override
    public boolean isLastDesignPattern() {
        if (designPatternPosition < designPatterns.size()) {
            return false;
        }
        return true;
    }

}
