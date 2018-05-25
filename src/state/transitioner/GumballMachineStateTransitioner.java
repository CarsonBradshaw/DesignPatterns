package state.transitioner;

import state.states.GumballMachineStates;
import state.states.State;

public class GumballMachineStateTransitioner extends StateTransitioner {

    private final State INITIAL_STATE = GumballMachineStates.OUT_OF_GUMBALLS;

    private GumballMachineStateTransitioner(Builder builder){
        super(builder);
    }

    @Override
    public State getInitialState() {
        return INITIAL_STATE;
    }

    public static class Builder extends StateTransitioner.Builder<Builder>{
        @Override
        public StateTransitioner build() {
            return new GumballMachineStateTransitioner(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
