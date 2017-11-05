package patterns.creational.singleton;

/**
 * Created by User on 05/11/2017.
 */
public class LazilyInitializedSingleton {

    private static LazilyInitializedSingleton instance;

    private LazilyInitializedSingleton() {}

    public static LazilyInitializedSingleton getInstance() {

        if (instance == null) {
            instance = new LazilyInitializedSingleton();
        }

        return instance;
    }
}
