package proxy.virtual;

public class ExpensiveToCreateClassProxy implements Subject {

    private volatile ExpensiveToCreateClass lazyExpensiveClass;

    @Override
    public void request() {
        if(lazyExpensiveClass == null){
            synchronized (this) {
                if(lazyExpensiveClass == null)
                    lazyExpensiveClass = new ExpensiveToCreateClass();
            }
        }
        lazyExpensiveClass.request();
    }
}
