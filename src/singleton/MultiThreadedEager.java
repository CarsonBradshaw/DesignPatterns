package singleton;

public class MultiThreadedEager {

    private static MultiThreadedEager instance = new MultiThreadedEager();

    private MultiThreadedEager(){}

    public static MultiThreadedEager getInstance(){
        return instance;
    }
}
