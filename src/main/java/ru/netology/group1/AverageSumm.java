package ru.netology.group1;

public class AverageSumm {

    public  int summ(int[]sales){
        int GeneralSumm = 0;
        for (int i = 0; i<sales.length;i++){
          GeneralSumm=GeneralSumm+ sales[i];
        }
        return GeneralSumm/12;
    }
}
