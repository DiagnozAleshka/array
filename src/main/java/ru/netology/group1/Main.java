package ru.netology.group1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           SumMonthMoreAverage service = new SumMonthMoreAverage();
           int [] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuallMonth = service.MonthMoreAverage(temps);
        System.out.println(actuallMonth);

        }
    }
