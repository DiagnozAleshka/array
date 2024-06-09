package ru.netology.group1;

public class summSales {


    public int summ(int[] sales) {
        int summMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            summMonth = summMonth+ sales[i];
        }
        return summMonth;
    }
}