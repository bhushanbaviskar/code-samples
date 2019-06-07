import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GrayCodesTest {

    private static GrayCode grayCode;

    @BeforeAll
    static void init() {
        grayCode = new GrayCode();
    }

    @Test
    void ZeroBitGrayCode() {
        List<Integer> result = grayCode.generate(0);
        assertTrue(result.size() == 1);
    }

    @Test
    void OneBitGrayCode() {
        List<Integer> result = grayCode.generate(1);
        assertNotNull(result);
        assertTrue(result.size() == 2);
    }

    @Test
    void TwoBitGrayCode() {
        List<Integer> result = grayCode.generate(2);
        assertNotNull(result);
        assertTrue(result.size() == 4);
        assertTrue(result.get(2) == 3);
        assertEquals(Arrays.asList(0, 1, 3, 2), result);
    }

    @Test
    void ThreeBitGrayCode() {
        List<Integer> result = grayCode.generate(3);
        assertNotNull(result);
        assertTrue(result.size() == 8);
        assertEquals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4), result);
    }

    @Test
    void FourBitGrayCode() {
        List<Integer> result = grayCode.generate(4);
        assertNotNull(result);
        assertTrue(result.size() == 16);
        assertEquals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8), result);
    }

}