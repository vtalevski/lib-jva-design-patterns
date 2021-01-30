package com.talevski.viktor;

import com.talevski.viktor.publisher.Channel;
import com.talevski.viktor.publisher.ChannelImpl;
import com.talevski.viktor.subscriber.Subscriber;
import com.talevski.viktor.subscriber.SubscriberImpl;

/**
 * Reference link for the Observer Design Pattern from Spring Framework Guru - 'https://springframework.guru/gang-of-four-design-patterns/observer-pattern'.
 * Reference link for the Observer Design Pattern from YouTube - 'https://www.youtube.com/watch?v=98DiwRp-KZk'.
 */
public class ObserverDesignPatternApplication { /* There are two types of Observer design pattern, push and pull. In
                                                   this tutorial, the push Observer design pattern is described. */
    public static void main(String[] args) {
        // Java Channel.
        Channel javaTutorials = new ChannelImpl("javaTutorials");

        // Subscribers subscribe to the Java Tutorials channel.
        Subscriber isaacNewton = new SubscriberImpl("Isaac Newton");
        javaTutorials.subscribe(isaacNewton);
        Subscriber nikolaTesla = new SubscriberImpl("Nikola Tesla");
        javaTutorials.subscribe(nikolaTesla);
        Subscriber albertEinstein = new SubscriberImpl("Albert Einstein");
        javaTutorials.subscribe(albertEinstein);

        javaTutorials.addNewVideo("Java Generics");
        javaTutorials.addNewVideo("Exception Handling.");

        javaTutorials.unsubscribe(isaacNewton);

        System.out.println();

        // Machine Learning Channel.
        Channel machineLearningTutorials = new ChannelImpl("machineLearningTutorials");

        // Subscribers subscribe to the Machine Learning Tutorials channel.
        machineLearningTutorials.subscribe(isaacNewton);
        machineLearningTutorials.subscribe(albertEinstein);

        machineLearningTutorials.addNewVideo("ANN");
    }
}
