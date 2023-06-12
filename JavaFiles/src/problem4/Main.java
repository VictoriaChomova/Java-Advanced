//package problem4;
//
//import java.io.*;
//import java.sql.Array;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            File myFIle = new File("string_data.txt");
//
//            Scanner myReader = new Scanner(myFIle);
//
//            List<String> fileContent = new ArrayList();
//
//            while (myReader.hasNext()) {
//                fileContent.add(myReader.nextLine());
//            }
//            File myFile2 = new File("string_reverse.txt");
//
//            if (myFile2.createNewFile()) {
//                System.out.println("File created: " + myFile2.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//
//            FileWriter myWriter = new FileWriter("string_reverse.txt");
//
//            for (int i = fileContent.size() - 1; i > 0; i--) {
//                myWriter.write(fileContent);
//            }
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
