package ru.netology.stats;


public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int lessThanAverage(long[] sales) {
        int underAverage = 0;
        double average = averageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                underAverage++;
            }
        }
        return underAverage;
    }

    public int moreThanAverage(long[] sales) {
        int overAverage = 0;
        double average = averageSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                overAverage++;
            }
        }
        return overAverage;
    }

}
