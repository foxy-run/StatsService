package ru.netology.stats;

public class StatsService1 {
    public long calculateMiddleSum(long[] sales) {
        long sum = 0;

        long average = 0;
        for (long sale : sales) {
            sum += sale;
           average =  sum / sales.length;
        }
        return average;
    }
}
