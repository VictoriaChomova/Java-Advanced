package problem6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction(3, 8);

        try {
            FileOutputStream fileOut = new FileOutputStream("fraction.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(a);

            out.close();
            fileOut.close();

            System.out.printf("Serialized data is saved in fraction.ser");

        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
