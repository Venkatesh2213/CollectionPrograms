import com.edu.streams.CreateIntStream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class IntStreamTest {
    private CreateIntStream intStream;

    @BeforeTest
    public void setUp() {
        intStream = new CreateIntStream();
    }

    @Test
    public void testIntStream1() {
        int start = 0;
        int end = 6;
        List<Integer> actual = intStream.getStream(start, end);
        List<Integer> expected = new ArrayList<>(6);
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(actual, expected);
    }

}
