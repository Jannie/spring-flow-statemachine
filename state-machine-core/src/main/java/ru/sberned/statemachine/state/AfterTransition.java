package ru.sberned.statemachine.state;

/**
 * Created by jpatuk on 09/11/2016.
 */
public interface AfterTransition<T> {
    void afterTransition(T item);
}