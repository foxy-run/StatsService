package ru.netology.stats;

public class StatsService2 {
    public long calculateFindMax(long[] sales) {
        long result = 0;
        long max = 0;
        for (long i : sales) {

            if (i > max) {
                max = i;
            }
        }
        long month = 0;
        for (long i : sales) {
            month++;
            if (i == max) {
                result = month;

            }


        }

        return result;
    }
}


