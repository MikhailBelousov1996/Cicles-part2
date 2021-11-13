package ru.neltology.stats;

import static org.junit.jupiter.api.Assertions.*;

class statsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldcalculateSum() {
        statsService service = new statsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMidleSumSales() {
        statsService service = new statsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.midleSale(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMonthMaxSales() {
        statsService service = new statsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.numberMonthMaxSales(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMonthMinSales() {
        statsService service = new statsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.numberMonthMinSales(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMonthLowMidle() {
        statsService service = new statsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberMonthSalesLowMidle(managerSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMonthOverMidle() {
        statsService service = new statsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberMonthSalesOverMidle(managerSales);

        assertEquals(expected, actual);
    }
}