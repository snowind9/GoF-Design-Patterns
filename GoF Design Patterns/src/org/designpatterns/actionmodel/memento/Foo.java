/**
 * 
 */
package org.designpatterns.actionmodel.memento;

/**
 * @author snow
 *
 */
public class Foo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        StateObj originator = new StateObj();
        originator.setState(new State("state1"));
        
        Caretaker<State> caretaker = new Caretaker<State>();
        caretaker.saveState(originator);
        
        originator.setState(new State("state2"));
        originator.setState(new State("state3"));
        
        caretaker.revertLast(originator);
        
        System.out.println(originator.getState());

    }

}
