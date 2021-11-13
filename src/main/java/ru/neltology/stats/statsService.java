package ru.neltology.stats;

public class statsService {
    public int calculateSum(int[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int midleSale(int[] sales) {
        int midle = sales[0];
        return calculateSum(sales) / sales.length;

    }

    public int numberMonthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        System.out.println(maxMonth + 1);
        return maxMonth + 1;
    }

    public int numberMonthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        System.out.println(minMonth + 1);
        return minMonth + 1;
    }

    public int numberMonthSalesLowMidle(int[] sales) {
        int midle = calculateSum(sales) / sales.length;
        int numberMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < midle) {
                month++;
            }
        }
        return month;
    }

    public int numberMonthSalesOverMidle(int[] sales) {
        int midle = calculateSum(sales) / sales.length;
        int numberMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > midle) {
                month++;
            }
        }
        return month;

    }
}

