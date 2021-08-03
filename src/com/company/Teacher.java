package com.company;

import com.company.observers.IObserver;

import java.util.ArrayList;

public class Teacher implements IObservable{
    ArrayList<IObserver> students;
    String inform;

    public Teacher() {
        students = new ArrayList();
        inform = new String();
    }

    public void setInform(String inform) {
        this.inform = inform;
    }

    @Override
    public void AddObserver(IObserver o) {
        students.add(o);
    }

    @Override
    public void RemoveObserver(IObserver o) {
        students.remove(o);
    }

    @Override
    public void NotifyObservers() {
        for(IObserver observer:students){
            observer.update(inform);
        }
    }
}
