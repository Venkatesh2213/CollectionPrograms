import com.edu.streams.Person;
import com.edu.streams.PersonFilter;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonFilterTest {
    List<Person> list;
    List<Person> actual;
    List<Person> expected;

    Person James = new Person("James", "Smith", 20);
    Person Michel = new Person("Michael", "Smith", 30);
    Person Maria = new Person("Maria", "Rodriguez", 35);
    Person Linda = new Person("Linda", "Thomas", 40);

    @BeforeMethod
    public void init() {
        list = new ArrayList<Person>(Arrays.asList(James, Michel, Maria, Linda));
    }

    @Test
    public void verifySortByAgeInDesc() {
        actual = PersonFilter.sortDesc(list);
        expected = new ArrayList<Person>(Arrays.asList(Linda, Maria, Michel, James));
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifySortByAgeAsce() {
        actual = PersonFilter.sortAsce(list);
        expected = new ArrayList<Person>(Arrays.asList(James, Michel, Maria, Linda));
        Assert.assertEquals(actual, expected);
    }

}
