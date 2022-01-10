package com.datamaskinmann.event;

import java.util.ArrayList;

public class Event<T> {
    private ArrayList<Observer<T>> observers = new ArrayList<>();

    public void add(Observer<T> observer) {
        observers.add(observer);
    }

    public void raise(T eventArgs) {
        observers.forEach(x -> {
            x.raise(eventArgs);
        });
    }

    public void remove(Observer<T> observer) {
        observers.remove(observer);
    }
}
