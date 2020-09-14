package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {

    @Test
    void calculateSum() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.calculateSum(sales));

    }


    @Test
    void calculateMiddleSum() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateMiddleSum(sales);
        assertEquals(expected, actual);
    }


    @Test
    void calculateFindMax() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calculateFindMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateFindMin() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.calculateFindMin(sales);
        assertEquals(expected, actual);
    }
    @Test
    void calculateSalesDown() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateSalesDown(sales);
        assertEquals(expected, actual);
    }
    @Test
    void calculateSalesUp() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateSalesUp(sales);
        assertEquals(expected, actual);
    }
}


