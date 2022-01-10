package com.datamaskinmann.event;

public interface Observer<T> {
    void raise(T arguments);
}
