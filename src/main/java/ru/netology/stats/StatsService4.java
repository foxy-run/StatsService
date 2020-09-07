package ru.netology.stats;

public class StatsService4 {

    public long calculateSalesDown(long[] sales) {
        long sale = 15;
        long count = 0;
        for (long i : sales) {
            if (i < sale) {
                count = count + 1;
            }

        }

        return count;
    }
}
