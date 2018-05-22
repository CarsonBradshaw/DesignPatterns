package singleton;

public class MultiThreadedLazyExpensive {

    private static MultiThreadedLazyExpensive instance;

    private  MultiThreadedLazyExpensive(){}

    public static synchronized MultiThreadedLazyExpensive getInstance(){
        if(instance == null)
            instance = new MultiThreadedLazyExpensive();
        return instance;
    }
}
