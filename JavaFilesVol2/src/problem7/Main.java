package problem7;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        File file = new File("file.txt");
        Scanner s2 = new Scanner(file);
        s2.useDelimiter("\\Z");
        String content = s2.next();
        s2.close();
        FileWriter fw = new FileWriter(file);
        fw.write(content+"\n"+s.nextLine());
        fw.close();
    }
}
