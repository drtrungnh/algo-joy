import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("😱")
    void example1() {
        assertEquals(321, solution.reverse(123));
    }

    @Test
    @DisplayName("😱")
    void example2() {
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    @DisplayName("😱")
    void example3() {
        assertEquals(21, solution.reverse(120));
    }
}
