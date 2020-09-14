package ru.netology.stats;

//Метод 1
public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

//Метод 2

    public long calculateMiddleSum(long[] sales) {
        long sum = 0;

        long average = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / sales.length;
        }
        return average;
    }

    //Метод 3

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

    //Метод 4

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

    //Метод 5

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

    //Метод 6

    public long calculateSalesUp(long[] sales) {
        long sale = 15;
        long count = 0;
        for (long i : sales) {
            if (i > sale) {
                count = count + 1;
            }
        }
        return count;
    }
}


