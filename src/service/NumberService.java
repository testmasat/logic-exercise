package service;

import model.Number;

public class NumberService {

    public boolean isEven(Number number) {
        return number.getValue() % 2 == 0;
    }
}