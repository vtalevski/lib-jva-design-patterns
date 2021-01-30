package com.talevski.viktor.aggregator;

import com.talevski.viktor.model.DesignPattern;
import com.talevski.viktor.iterator.DesignPatternIterator;

public interface DesignPatternAggregator {
    void addPattern(DesignPattern designPattern);

    void removePattern(DesignPattern designPattern);

    DesignPatternIterator getDesignPatternIterator();

}
