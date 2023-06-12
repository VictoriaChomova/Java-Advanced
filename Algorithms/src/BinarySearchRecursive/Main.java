package BinarySearchRecursive;

public class Main {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch ();

        int[] numbersArr = {3, 7, 10, 12, 15, 22, 28, 29, 38, 43};

        int arrLength = numbersArr.length;

        int numberWanted = 29;

        int index = search.binarySearch (numbersArr, 0, arrLength - 1, numberWanted);


        if (index == -1) {
            System.out.println ("Element not found");
        } else {
            System.out.println ("Index: " + index);
        }
    }
}
