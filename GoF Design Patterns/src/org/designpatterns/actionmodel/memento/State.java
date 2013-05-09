package org.designpatterns.actionmodel.memento;

public class State {
    
    private String state;
    
    public State(String state){
        this.state = state;
    }

    /**
     * @return the state
     */
    public final String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public final void setState(String state) {
        this.state = state;
    }
    

}
