import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void shouldTestComplementNo() {
        assertEquals(twoSum.twoSum(new int[]{2, 4, 5, 6, 7}, 8), new int[]{0, 3});
    }

}