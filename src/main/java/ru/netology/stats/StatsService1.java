package ru.netology.stats;

public class StatsService1 {
    public long calculateMiddleSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum / 12;
    }
}
