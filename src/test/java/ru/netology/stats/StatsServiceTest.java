package ru.netology.stats;
import org.junit.jupiter.api.Test;


class StatsServiceTest {

    @Test
    void calculateSum() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        System.out.println(service.calculateSum(sales));

    }


    @Test
    void calculateMiddleSum() {
        StatsService1 service = new StatsService1();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.calculateMiddleSum(sales));
    }


    @Test
    void calculateFindMax() {

        StatsService2 service = new StatsService2();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.calculateFindMax(sales));
    }
    @Test
    void calculateFindMin() {

        StatsService3 service = new StatsService3();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.calculateFindMin(sales));
    }

}
