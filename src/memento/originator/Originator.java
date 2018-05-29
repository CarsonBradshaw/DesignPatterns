package memento.originator;

public class Originator {

    private String state;

    public void setValue(String state){
        this.state = state;
    }

    public Memento saveToMemento(){
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento){
        this.state = memento.getSavedState();
        System.out.println("Originator restored to : " + state);
    }

    public static class Memento{
        private final String state;

        private Memento(String state){
            this.state = state;
        }

        private String getSavedState(){
            return this.state;
        }
    }
}
