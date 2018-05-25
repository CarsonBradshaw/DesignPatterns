package state.context;

import state.states.GumballMachineStates;
import state.states.State;
import state.transitioner.StateTransitioner;
import state.transitions.GumballMachineTransitions;

public class StateDrivenGumballMachine implements GumballMachine {

    private int currGumballs;

    private StateTransitioner stateTransitioner;
    private State currState;

    public StateDrivenGumballMachine(StateTransitioner stateTransitioner, int initialGumballs){
        this.stateTransitioner = stateTransitioner;
        this.currState = stateTransitioner.getInitialState();
        fill(initialGumballs);
    }

    @Override
    public void insertQuarter() {
        currState = stateTransitioner.getNextState(currState, GumballMachineTransitions.INSERT_QUARTER);
    }

    @Override
    public void ejectQuarter() {
        currState = stateTransitioner.getNextState(currState, GumballMachineTransitions.EJECT_QUARTER);
    }

    @Override
    public void turnCrank() {
        currState = stateTransitioner.getNextState(currState, GumballMachineTransitions.TURN_CRANK);
        if(currState == GumballMachineStates.GUMBALL_SOLD)
            releaseGumball();
    }

    @Override
    public void releaseGumball() {
        System.out.println("Here's your gumball!");
        currGumballs--;
        if(currGumballs == 0)
            currState = stateTransitioner.getNextState(currState, GumballMachineTransitions.DISPENSE_GUMBALL_TO_EMPTY);
        else
            currState = stateTransitioner.getNextState(currState, GumballMachineTransitions.DISPENSE_GUMBALL);
    }

    @Override
    public void fill(int numGumballs) {
        currGumballs += numGumballs;
        currState = stateTransitioner.getNextState(currState, GumballMachineTransitions.FILL);
    }
}
