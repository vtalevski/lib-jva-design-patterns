package com.talevski.viktor.subscriber;

public interface Subscriber {
    void confirmSubscription(String channelName);

    void confirmUnsubscription(String channel);

    void notifySubscriber(String channelName, String videoName);
}
