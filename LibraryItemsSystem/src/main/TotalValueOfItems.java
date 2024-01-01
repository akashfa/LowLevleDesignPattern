package main;

import items.LibraryItems;

public class TotalValueOfItems {
    private LibraryItems[]items;
    public TotalValueOfItems(LibraryItems[] items) {
        this.items = items;
    }
      public double totalValues(){
        double totalValue=0;
        for(LibraryItems item:items){
            totalValue+= item.getValues();
        }
        return totalValue;
      }

}
