package ru.netology.group1;

public class SumMonthLessAverage {


    public int averageSales(int [] sales){
        int average = 0;
        for (int i =0;i<sales.length;i++){
            average = average +  sales[i];
        }
        return average /12;
    }


    public int MonthLessAverage(int[] sales) {
        int month = averageSales(sales);
        int sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i]<month){
                sumSales++;
            }
        }
        return sumSales ;
    }



}
