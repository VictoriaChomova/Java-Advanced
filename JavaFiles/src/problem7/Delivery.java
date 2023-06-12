package problem7;

import org.w3c.dom.ls.LSOutput;

public class Delivery implements java.io.Serializable {
    double packageWeight;
    double packagePrice;
    boolean isUrgent;

    public Delivery(double packageWeight, double packagePrice, boolean isUrgent) {
        this.packageWeight = packageWeight;
        this.packagePrice = packagePrice;
        this.isUrgent = isUrgent;
    }

    public void printDelivery (){
        System.out.printf("Package weight: %.2f%nPackage Price: %.2f%nIs Urgent: %s",
                this.packageWeight, this.packagePrice, this.isUrgent);
    }
}
