package singleton;

public class SingleThreadedLazy {

    private static SingleThreadedLazy instance;

    private SingleThreadedLazy(){}

    public static SingleThreadedLazy getInstance(){
        if(instance == null)
            instance = new SingleThreadedLazy();
        return instance;
    }

}
