import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    private List<Integer> list(Integer... number) {
        return Arrays.asList(number);
    }

    @Test
    public void test_one() {
        assertEquals(list(), PrimeFactors.of(1));
    }

    @Test
    public void test_two() {
        assertEquals(list(2), PrimeFactors.of(2));
    }

    @Test
    public void test_three() {
        assertEquals(list(3), PrimeFactors.of(3));
    }

    @Test
    public void test_four() {
        assertEquals(list(2, 2), PrimeFactors.of(4));
    }

    @Test
    public void test_six() {
        assertEquals(list(2, 3), PrimeFactors.of(6));
    }

    @Test
    public void test_eight() {
        assertEquals(list(2, 2, 2), PrimeFactors.of(8));
    }

    @Test
    public void test_nine() {
        assertEquals(list(3,3), PrimeFactors.of(9));
    }
}
