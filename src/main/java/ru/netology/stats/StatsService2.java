package ru.netology.stats;

public class StatsService2 {
    public long calculateFindMax(long[] sales) {
        long currentMax = sales[0];

        for (long sale : sales) {
            if (currentMax < sale) {

                currentMax = sale;
            }
        }
        return currentMax;
    }
}




