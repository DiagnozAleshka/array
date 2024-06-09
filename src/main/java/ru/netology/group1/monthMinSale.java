package ru.netology.group1;

public class monthMinSale {
    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
}
