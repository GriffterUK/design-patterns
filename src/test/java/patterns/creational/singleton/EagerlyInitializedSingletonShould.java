package patterns.creational.singleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by User on 05/11/2017.
 */
public class EagerlyInitializedSingletonShould {

    @Test
    public void createOnlyOneInstanceOfItself() {
        LazilyInitializedSingleton firstSingleton = LazilyInitializedSingleton.getInstance();
        LazilyInitializedSingleton secondSingleton = LazilyInitializedSingleton.getInstance();

        assertThat(firstSingleton, is(secondSingleton));
    }
}
