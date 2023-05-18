package service;

public class CalculationService {
    Integer addConditional(Integer number1, Integer number2) {
        if(number1 > number2) {
            return number1 + number2;
        }
        else {
                return number2 - number1;
        }
    }
}
