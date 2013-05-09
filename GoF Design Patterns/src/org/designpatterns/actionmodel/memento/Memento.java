package org.designpatterns.actionmodel.memento;

public class Memento<K> {
    
    Memento(K state){
        setMemento(state);
    }
    
    private K state;
    
    public void setMemento(K state){
        this.state = state;
    }
    
    public K getMemento(){
        return state;
    }

}
