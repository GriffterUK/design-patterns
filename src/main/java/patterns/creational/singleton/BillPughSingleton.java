package patterns.creational.singleton;

/**
 * Created by User on 05/11/2017.
 */
public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonCreate {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonCreate.INSTANCE;
    }
}
