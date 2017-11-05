package patterns.creational.singleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by User on 05/11/2017.
 */
public class BillPughSingletonShould {

    @Test
    public void createOnlyOneInstanceOfItself() {
        BillPughSingleton firstSingleton = BillPughSingleton.getInstance();
        BillPughSingleton secondSingleton = BillPughSingleton.getInstance();

        assertThat(firstSingleton, is(secondSingleton));
    }
}
