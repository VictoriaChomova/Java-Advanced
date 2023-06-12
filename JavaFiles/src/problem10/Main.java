package problem10;

import problem6.Fraction;
import problem7.Delivery;
import problem8.Ship;
import problem9.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {


        Fraction a = null;
        Delivery myDelivery = null;
        Ship myShip = null;
        User newUser = null;

        try {
            FileInputStream fileIn = new FileInputStream("fraction.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            a = (Fraction) in.readObject();
            in.close();
            fileIn.close();

            fileIn = new FileInputStream("delivery.ser");
            in = new ObjectInputStream(fileIn);
            myDelivery = (Delivery) in.readObject();
            in.close();
            fileIn.close();

            fileIn = new FileInputStream("ship.ser");
            in = new ObjectInputStream(fileIn);
            myShip = (Ship) in.readObject();
            in.close();
            fileIn.close();

            fileIn = new FileInputStream("user.ser");
            in = new ObjectInputStream(fileIn);
            newUser = (User) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        a.printFraction();
        myDelivery.printDelivery();
        myShip.printShip();
        newUser.printUser();


    }
}

