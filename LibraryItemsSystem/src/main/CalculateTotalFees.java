package main;

public class CalculateTotalFees {
    public int totalFeesCalaculate(LateFeeCalculate[] items,int day){
        int totlFees=0;
        for(LateFeeCalculate item:items){
            totlFees+=item.getCalculateFee(day);
        }
         return totlFees;
    }
}
