package singleton;

import java.io.Serializable;

public class SerializationSafety implements Serializable {
    private static final SerializationSafety INSTANCE = new SerializationSafety();
    private SerializationSafety(){}
    public static SerializationSafety getInstance(){
        return INSTANCE;
    }

    protected Object readResolve(){
        return INSTANCE;
    }
}
