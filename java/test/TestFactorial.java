import com.dev.factorial.Factorial;
import junit.framework.TestCase;
import org.junit.Test;

public class TestFactorial extends TestCase {

    @Test
    public void testFactorialZeroShouldBeOne() {
        assertEquals(1, Factorial.calculate(0));
    }

    public void testFactorialOneShouldBeOne() {
        assertEquals(1, Factorial.calculate(1));
    }

    public void testFactorialThreeShouldBeSix() {
        assertEquals(6, Factorial.calculate(3));
    }

    public void testFactorialForBiggerNumbers() {
        assertEquals(1307674368000L, Factorial.calculate(15));
    }
}