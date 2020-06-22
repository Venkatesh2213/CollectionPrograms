import com.edu.streams.EvenOrOdd;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class EvenOrOddTest {
    EvenOrOdd evenOrOdd;

    @BeforeTest
    public void setUp() {
        evenOrOdd = new EvenOrOdd();
        evenOrOdd.validation();
    }

    @Test
    public void even() {

        assertTrue(evenOrOdd.predicate.test(4));
    }

    @Test
    public void odd() {
        assertTrue(evenOrOdd.predicate.test(5));
    }

    @Test
    public void negativeCase() {

        assertFalse(evenOrOdd.predicate.test(-1));
    }

    @Test
    public void zeroTestCase() {

        assertTrue(evenOrOdd.predicate.test(0));
    }
}
