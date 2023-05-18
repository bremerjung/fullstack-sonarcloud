package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {

    @Test
    void testAddConditional() {
        CalculationService calculationService = new CalculationService();
        Integer actual = calculationService.addConditional(1, 2);
        assertTrue(actual == 3);
    }

}