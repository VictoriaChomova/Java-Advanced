package problem9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main { public static void main(String[] args) throws IOException {

   User newUser = new User("Viktoria", "12345", "21.02.2023");

    try {
        FileOutputStream fileOut = new FileOutputStream("user.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(newUser);

        fileOut.close();
        out.close();

        System.out.printf("Serialized data is saved in ship.ser");
    }  catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
