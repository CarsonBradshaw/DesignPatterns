package builder.doors;

public class EmptyDoor implements Door {
    @Override
    public void displayDoor() {
        System.out.println("My door is see through.");
    }
}
