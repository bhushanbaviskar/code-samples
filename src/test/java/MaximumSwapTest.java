import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSwapTest {

    private static  MaximumSwap maximumSwap;

    @BeforeAll
    static void init(){
        maximumSwap = new MaximumSwap();
    }

    @Test
    void maximumSwapCase1() {
        int result = maximumSwap.maximumSwap(4321);
        assertEquals(4321, result);
    }

    @Test
    void maximumSwapCase2() {
        int result = maximumSwap.maximumSwap(1234);
        assertEquals(4231, result);
    }

    @Test
    void maximumSwapCase3() {
        int result = maximumSwap.maximumSwap(9989);
        assertEquals(9998, result);
    }

}