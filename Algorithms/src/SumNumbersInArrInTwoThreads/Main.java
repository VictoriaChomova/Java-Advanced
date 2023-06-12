package SumNumbersInArrInTwoThreads;


public class Main {

    public static void main(String[] args) {
        int[] numbersArr = {1,2,3,4,5,6,7,8,9};

        MyThread thread1 = new MyThread (numbersArr, 1);
        MyThread thread2 = new MyThread (numbersArr, 2);
        MyThread thread3 = new MyThread (numbersArr, 3);


        thread1.start ();
        thread2.start ();
        thread3.start ();

    }
}
