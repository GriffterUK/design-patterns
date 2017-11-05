package patterns.creational.singleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by User on 05/11/2017.
 */
public class LazilyInitializedSingletonShould {

    @Test
    public void createOnlyOneInstanceOfItself() {
        EagerlyInitializedSingleton firstSingleton = EagerlyInitializedSingleton.getInstance();
        EagerlyInitializedSingleton secondSingleton = EagerlyInitializedSingleton.getInstance();

        assertThat(firstSingleton, is(secondSingleton));
    }
}
