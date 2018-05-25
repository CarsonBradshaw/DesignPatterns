package state.context;

public interface GumballMachine {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void releaseGumball();
    void fill(int numGumballs);
}
