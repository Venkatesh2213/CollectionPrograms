import com.edu.streams.PredicateClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PredicateTest {
    @Test
    public void testTrue() {
        String input = "Welcome to Lambda";
        boolean actual = PredicateClass.lengthOf(input, 20);
        boolean expected = true;
        System.out.println(expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFalse() {
        String input = "Whitebox Learning";
        boolean actual = PredicateClass.lengthOf(input, 20);
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void methodAndTrueTest() {
        String input = "Welcome To Lambda";
        boolean actual = PredicateClass.methodAnd(input);
        System.out.println(actual);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void methodAndFalseTest() {
        String input = " W B L";
        boolean actual = PredicateClass.methodAnd(input);
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void methodOrTrueTest() {
        String input = "Whitebox Learning";
        boolean actual = PredicateClass.methodOr(input);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void methodOrFalseTest() {
        String input = "W B L ";
        boolean actual = PredicateClass.methodOr(input);
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void methodEqualTrueTest() {
        String input = "WBL";
        String input2 = "WBL";
        boolean actual = PredicateClass.methodEqual(input, input2);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void methodEqualFalseTest() {
        String input = "White box learning";
        String input2 = "WBL";
        boolean actual = PredicateClass.methodEqual(input, input2);
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void methodEqualNumFalseTest() {
        String input = "1122334455";
        String input2 = "111222333444";
        boolean actual = PredicateClass.methodEqual(input, input2);
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }
}
