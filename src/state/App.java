package state;

import state.context.GumballMachine;
import state.context.StateDrivenGumballMachine;
import state.states.GumballMachineStates;
import state.transitioner.GumballMachineStateTransitioner;
import state.transitioner.StateTransitioner;
import state.transitions.GumballMachineTransitions;

public class App {
    public static void main(String[] args) {

        StateTransitioner.Builder builder = new GumballMachineStateTransitioner.Builder();

        builder.fromState(GumballMachineStates.OUT_OF_GUMBALLS)
               .toState(GumballMachineStates.NO_QUARTER)
               .withTransition(GumballMachineTransitions.FILL)
               .add();

        builder.fromState(GumballMachineStates.NO_QUARTER)
               .toState(GumballMachineStates.HAS_QUARTER)
               .withTransition(GumballMachineTransitions.INSERT_QUARTER)
               .add();

        builder.fromState(GumballMachineStates.HAS_QUARTER)
               .toState(GumballMachineStates.NO_QUARTER)
               .withTransition(GumballMachineTransitions.EJECT_QUARTER)
               .add();

        builder.fromState(GumballMachineStates.HAS_QUARTER)
               .toState(GumballMachineStates.GUMBALL_SOLD)
               .withTransition(GumballMachineTransitions.TURN_CRANK)
               .add();

        builder.fromState(GumballMachineStates.GUMBALL_SOLD)
               .toState(GumballMachineStates.NO_QUARTER)
               .withTransition(GumballMachineTransitions.DISPENSE_GUMBALL)
               .add();

        builder.fromState(GumballMachineStates.GUMBALL_SOLD)
               .toState(GumballMachineStates.OUT_OF_GUMBALLS)
               .withTransition(GumballMachineTransitions.DISPENSE_GUMBALL_TO_EMPTY)
               .add();

        StateTransitioner stateTransitioner = builder.build();

        GumballMachine gumballMachine = new StateDrivenGumballMachine(stateTransitioner, 4);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
