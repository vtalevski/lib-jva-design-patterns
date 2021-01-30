package com.talevski.viktor.publisher;

import com.talevski.viktor.subscriber.Subscriber;

public interface Channel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void addNewVideo(String videoName);

    void notifySubscribers(String videoName);
}
