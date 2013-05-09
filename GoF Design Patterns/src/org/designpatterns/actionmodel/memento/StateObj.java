/**
 * 原发器
 */
package org.designpatterns.actionmodel.memento;

/**
 * @author snow
 *
 */
public class StateObj implements Originator<State> {
    
    private State state;
    
    @Override
    public Memento<State> createMemento(){
        return new Memento<State>(state);
    }
    
    @Override
    public void SetMemento(Memento<State> memento){
        this.state = memento.getMemento();
    }
    
    /**
     * @return the state
     */
    public final State getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public final void setState(State state) {
        this.state = state;
    }

}


