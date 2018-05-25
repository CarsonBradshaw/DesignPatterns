package state.transitions;

public enum GumballMachineTransitions implements Transition {
    FILL, INSERT_QUARTER, EJECT_QUARTER,
    TURN_CRANK, DISPENSE_GUMBALL,
    DISPENSE_GUMBALL_TO_EMPTY
}
