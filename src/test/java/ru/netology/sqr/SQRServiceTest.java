package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCount() {
        SQRService service = new SQRService();

        int actual = service.countSqr(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countNumbers() {
        SQRService service = new SQRService();

        int actual = service.countSqr(-100, 500);
        int expected = 13;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countNumbersFromLargestToSmallest() {
        SQRService service = new SQRService();

        int actual = service.countSqr(400, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countNegativeNumbers() {
        SQRService service = new SQRService();

        int actual = service.countSqr(-300, -200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

