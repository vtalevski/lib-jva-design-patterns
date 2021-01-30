package com.talevski.viktor.aggregator;

import com.talevski.viktor.model.DesignPattern;
import com.talevski.viktor.iterator.DesignPatternIterator;
import com.talevski.viktor.iterator.DesignPatternIteratorImpl;

import java.util.ArrayList;
import java.util.List;

public class DesignPatternAggregatorImpl implements DesignPatternAggregator {
    List<DesignPattern> designPatterns;

    public DesignPatternAggregatorImpl() {
        designPatterns = new ArrayList<>();
    }

    @Override
    public void addPattern(DesignPattern designPattern) {
        designPatterns.add(designPattern);
    }

    @Override
    public void removePattern(DesignPattern designPattern) {
        designPatterns.remove(designPattern);
    }

    @Override
    public DesignPatternIterator getDesignPatternIterator() {
        return new DesignPatternIteratorImpl(designPatterns);
    }

}
