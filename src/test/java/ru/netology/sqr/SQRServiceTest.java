package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/number.csv")

    public void testNumberRange(int expected, int lowBorder, int highBorder) {
        SQRService service = new SQRService();

        // int expected = 3;
        int actual = service.countSquared(lowBorder, highBorder);

        Assertions.assertEquals(expected, actual);
    }
}

