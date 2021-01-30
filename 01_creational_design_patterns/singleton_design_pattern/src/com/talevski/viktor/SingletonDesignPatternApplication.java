package com.talevski.viktor;

import com.talevski.viktor.doubleCheckedLocking.Singleton;

/**
 * Reference link for the Singleton Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/singleton-design-pattern'.
 * Reference link for explaining the Singleton Design Pattern on YouTube - 'https://www.youtube.com/watch?v=Z5TRputhzHs'.
 * Reference link for explaining the use of the volatile keyword when using Double Checked Locking in the Singleton Design Pattern - 'https://stackoverflow.com/questions/11639746/what-is-the-point-of-making-the-singleton-instance-volatile-while-using-double-l?noredirect=1&lq=1'.
 */
public class SingletonDesignPatternApplication {
    public static void main(String[] args) {
        com.talevski.viktor.eagerInstantiation.Singleton eagerSingletonOne = com.talevski.viktor.eagerInstantiation.Singleton.getInstance();
        com.talevski.viktor.eagerInstantiation.Singleton eagerSingletonTwo = com.talevski.viktor.eagerInstantiation.Singleton.getInstance();

        com.talevski.viktor.lazyInstantiation.Singleton lazySingletonOne = com.talevski.viktor.lazyInstantiation.Singleton.getInstance();
        com.talevski.viktor.lazyInstantiation.Singleton lazySingletonTwo = com.talevski.viktor.lazyInstantiation.Singleton.getInstance();

        com.talevski.viktor.threadSafe.Singleton threadSageSingletonOne = com.talevski.viktor.threadSafe.Singleton.getInstance();
        com.talevski.viktor.threadSafe.Singleton threadSageSingletonTwo = com.talevski.viktor.threadSafe.Singleton.getInstance();

        Singleton doubleCheckedLockingSingletonOne = Singleton.getInstance();
        Singleton doubleCheckedLockingSingletonTwo = Singleton.getInstance();

        com.talevski.viktor.enumeration.Singleton enumerationSingletonOne = com.talevski.viktor.enumeration.Singleton.INSTANCE;
        com.talevski.viktor.enumeration.Singleton enumerationSingletonTwo = com.talevski.viktor.enumeration.Singleton.INSTANCE;
    }
}
