package ru.netology.stats;

public class StatsService3 {
    public long calculateFindMin(long[] sales) {
        long result = 0;
        long month = 0;
long min = sales[0];
        for (long i : sales) {

            if (i < min) {
                min = i;
            }
        }
            for (long i : sales) {
            month++;
            if (i == min) {
                result = month;

            }


        }

        return result;
    }
}