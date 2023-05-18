package service;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {

    void testAddConditional() {
        CalculationService calculationService = new CalculationService();
        Integer actual = calculationService.addConditional(1, 2);
        assertTrue(actual == 3);
    }

}