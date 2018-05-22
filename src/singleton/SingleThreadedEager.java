package singleton;

public class SingleThreadedEager {

    private static SingleThreadedEager instance = new SingleThreadedEager();

    private SingleThreadedEager(){}

    public static SingleThreadedEager getInstance(){
        return instance;
    }
}
