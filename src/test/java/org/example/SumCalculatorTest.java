package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    void start() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumWithPositiveNumberTest() {
        int expectedResult = 6;
        int actualResult = sumCalculator.sum(3);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void sumTest2() {
        int expectedResult = 1;
        int actualResult = sumCalculator.sum(1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void SumWithZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,() -> sumCalculator.sum(0));
    }
}