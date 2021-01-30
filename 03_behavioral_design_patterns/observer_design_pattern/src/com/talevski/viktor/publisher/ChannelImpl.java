package com.talevski.viktor.publisher;

import com.talevski.viktor.subscriber.Subscriber;

import java.util.HashSet;
import java.util.Set;

public class ChannelImpl implements Channel {
    private String channelName;
    private Set<Subscriber> subscribers;
    private Set<String> videos;

    public ChannelImpl(String channelName) {
        this.channelName = channelName;
        subscribers = new HashSet<>();
        videos = new HashSet<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        subscriber.confirmSubscription(channelName);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        subscriber.confirmUnsubscription(channelName);
    }

    @Override
    public void addNewVideo(String videoName) {
        videos.add(videoName);
        notifySubscribers(videoName);
    }

    @Override
    public void notifySubscribers(String videoName) {
        subscribers.forEach(subscriber -> subscriber.notifySubscriber(channelName, videoName));
    }
}
