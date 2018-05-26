package proxy.virtual;

public class ExpensiveToCreateClass implements Subject {

    public ExpensiveToCreateClass() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void request() {
        System.out.println("Performing request...");
    }
}
