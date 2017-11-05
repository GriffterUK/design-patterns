package patterns.creational.singleton;

/**
 * Created by User on 05/11/2017.
 */
public class EagerlyInitializedSingleton {

    private static final EagerlyInitializedSingleton instance = new EagerlyInitializedSingleton();

    private EagerlyInitializedSingleton() {}

    public static EagerlyInitializedSingleton getInstance() {
        return instance;
    }
}
