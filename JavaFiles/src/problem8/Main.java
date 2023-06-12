package problem8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        Ship myShip = new Ship("container", 5468.56, 50.32, "food supply", "Food company");

        try {
            FileOutputStream fileOut = new FileOutputStream("ship.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myShip);

            fileOut.close();
            out.close();

            System.out.printf("Serialized data is saved in ship.ser");
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
