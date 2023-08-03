package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumeralsShould {

    @ParameterizedTest
    @CsvSource({
            "0,''",
            "1,I",
            "2,II",
            "3,III"
    })
    void convert_number_to_a_i_roman_number(int number, String expected) {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.process(number);
        assertEquals(expected, result);
    }
}
