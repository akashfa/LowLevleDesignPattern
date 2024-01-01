package items;

import main.LateFeeCalculate;

public interface LibraryItems  extends LateFeeCalculate {
    String getTitle();
    String getUniqueId();


    int getCalculateLateFee(int days);

    double getValues();
}