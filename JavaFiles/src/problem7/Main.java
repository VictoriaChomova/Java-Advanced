package problem7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Delivery myDelivery = new Delivery(2.54, 7.5, true);

        try {
            FileOutputStream fileOut = new FileOutputStream("delivery.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(myDelivery);
            out.close();
            fileOut.close();

            System.out.printf("Serialized data is saved in delivery.ser");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
