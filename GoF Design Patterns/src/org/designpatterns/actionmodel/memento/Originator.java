package org.designpatterns.actionmodel.memento;

public interface Originator<T> {
    
    public Memento<T> createMemento();
    
    public void SetMemento(Memento<T> memento);

}
