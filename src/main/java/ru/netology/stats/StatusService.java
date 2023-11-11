package ru.netology.stats;

public class StatusService {

    public long amountSales(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;

        }
        return allSales;
    }


    public long avrgSales(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }

        long avrgSales = allSales / 12;
        return avrgSales;

    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAvrgSales(long[] sales) {
        int countMonth = 0;
        long avrgSales = avrgSales(sales);
        for (long sale : sales) {
            if (sale < avrgSales) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int maxAvrgSales(long[] sales) {
        int countMonth = 0;
        long avrgSales = avrgSales(sales);
        for (long sale : sales) {
            if (sale > avrgSales) {
                countMonth++;
            }

        }
        return countMonth;
    }


}



