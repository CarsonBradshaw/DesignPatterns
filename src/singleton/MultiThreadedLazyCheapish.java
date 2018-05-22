package singleton;

public class MultiThreadedLazyCheapish {

    private static volatile MultiThreadedLazyCheapish instance;

    private MultiThreadedLazyCheapish(){}

    public static MultiThreadedLazyCheapish getInstance(){
        if(instance == null){
            synchronized (MultiThreadedLazyCheapish.class){
                if(instance == null)
                    instance = new MultiThreadedLazyCheapish();
            }
        }
        return instance;
    }
}
