package org.designpatterns.actionmodel.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker<T> {
    
    private List<Memento<T>> history = new ArrayList<Memento<T>>();
    
    public void saveState(Originator<T> originator) {
        
        Memento<T> memento = originator.createMemento();
        history.add(memento);
    }
    
    public void revertLast(Originator<T> originator) {
        if (history.size() == 0){
            return;// throws new Exception();
        }
        Memento<T> memento = history.remove(history.size()-1);
        originator.SetMemento(memento);
    }

}
