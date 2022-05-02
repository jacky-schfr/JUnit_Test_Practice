import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitTest {
    TestMethods t = new TestMethods();

    @Test
    public void sampleTests() {
        Assertions.assertAll(
                () -> assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, t.tri(new double[]{0, 0, 1}, 10)),
                () -> assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, t.tri(new double[]{0, 1, 1}, 10)),
                () -> assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, t.tri(new double[]{1, 1, 1}, 10)));

    }

    @Test
    public void example() {
        assertArrayEquals(new int[]{0, 4}, t.simpleList(2));
        assertArrayEquals(new int[]{0, 32}, t.simpleList(16));


    }
}
