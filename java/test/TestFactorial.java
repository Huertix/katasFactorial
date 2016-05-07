import com.dev.factorial.Factorial;
import junit.framework.TestCase;
import org.junit.Test;

public class TestFactorial extends TestCase {

    @Test
    public void test() {
        assertTrue(true);
    }


    public void testFactorialZeroShouldBeOne() {
        assertEquals(1, Factorial.calculate(0));
    }
/*
    it("1! should be 1", function(){
        expect(factorial(1)).toBe(1);
    });

    it("3! should be 6", function(){
        expect(factorial(3)).toBe(6);
    });

    it("15! should be 1.307.674.368.000", function(){
        expect(factorial(15)).toBe(1307674368000);
    });



*/

}

