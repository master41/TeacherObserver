package com.company;

import com.company.observers.IObserver;

public interface IObservable {
    public void AddObserver(IObserver o);
    public void RemoveObserver(IObserver o);
    public void NotifyObservers();
}
