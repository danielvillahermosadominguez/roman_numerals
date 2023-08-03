package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumeralsShould {

    @Test
    public void test_when_zero_is_provided_then_empty_string_is_provided() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.process(0);
        assertEquals(result, "");
    }
}
