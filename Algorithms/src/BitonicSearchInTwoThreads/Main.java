package BitonicSearchInTwoThreads;

public class Main {
    public static void main(String[] args) {

        int[] numbersArr = {1, 3, 5, 10, 18, 9, 8, 7, 6, 2};
        int numberWanted = 3;

        MyThread thread1 = new MyThread (numbersArr, numberWanted, 1);
        MyThread thread2 = new MyThread (numbersArr, numberWanted, 2);

        thread1.start ();
        thread2.start ();
    }
}
