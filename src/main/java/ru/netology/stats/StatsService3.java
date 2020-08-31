package ru.netology.stats;

public class StatsService3 {
    public long calculateFindMin(long[] sales) {
        long currentMax = sales[0];

        for (long sale : sales) {
            if (currentMax > sale) {

                currentMax = sale;
            }
        }
        return currentMax;
    }
}
