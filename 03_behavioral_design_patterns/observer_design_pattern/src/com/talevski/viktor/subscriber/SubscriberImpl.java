package com.talevski.viktor.subscriber;

import java.util.HashSet;
import java.util.Set;

public class SubscriberImpl implements Subscriber {
    private String subscriberName;
    private Set<String> channels;

    public SubscriberImpl(String subscriberName) {
        this.subscriberName = subscriberName;
        channels = new HashSet<>();
    }

    @Override
    public void confirmSubscription(String channelName) {
        channels.add(channelName);
    }

    @Override
    public void confirmUnsubscription(String channel) {
        channels.remove(channel);
    }

    @Override
    public void notifySubscriber(String channelName, String videoName) {
        System.out.println("The subscriber '" + subscriberName + "' was notified that the new video '" + videoName + "' was uploaded by the '" + channelName + "' channel.");
    }
}
