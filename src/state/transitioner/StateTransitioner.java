package state.transitioner;

import state.states.State;
import state.transitions.Transition;

import java.util.HashMap;
import java.util.Map;

public abstract class StateTransitioner {
    private final Map<State, Map<Transition, State>> stateMap;

    protected StateTransitioner(Builder<?> builder){
        stateMap = builder.stateToStateFromTransitionMap;
    }

    public abstract State getInitialState();

    public State getNextState(State currState, Transition transition){
        if(stateMap.get(currState) == null || !stateMap.get(currState).containsKey(transition))
            return currState;
        return stateMap.get(currState).get(transition);
    }

    public boolean isValidNextState(State currState, Transition transition){
        if(stateMap.get(currState) == null || !stateMap.get(currState).containsKey(transition))
            return false;
        return stateMap.get(currState).containsKey(transition);
    }

    public abstract static class Builder<T extends Builder<T>>{
        private final Map<State, Map<Transition, State>> stateToStateFromTransitionMap;
        private State fromState;
        private State toState;
        private Transition transition;

        public Builder(){
            stateToStateFromTransitionMap = new HashMap<>();
        }

        public T fromState(State fromState){
            this.fromState = fromState;
            return self();
        }

        public T toState(State toState){
            this.toState = toState;
            return self();
        }

        public T withTransition(Transition transition){
            this.transition = transition;
            return self();
        }

        public boolean add(){
            if(fromState == null || toState == null || transition == null)
                return false;
            Map<Transition, State> updatedTransitionToStateMap
                    = stateToStateFromTransitionMap.getOrDefault(fromState, new HashMap<>());
            boolean changed = updatedTransitionToStateMap.put(transition, toState) != null;
            stateToStateFromTransitionMap.put(fromState, updatedTransitionToStateMap);
            fromState = null;
            toState = null;
            transition = null;
            return changed;
        }

        public abstract StateTransitioner build();
        protected abstract T self();
    }
}
