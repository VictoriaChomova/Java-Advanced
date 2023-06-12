package SumNumbersInArrInTwoThreads;

public class MyThread extends Thread{
    int[] numbersArr;
    int thread;

    public MyThread (int[] numbersArr, int thread) {
        this.numbersArr = numbersArr;
        this.thread = thread;
    }

    public void run() {
        SumNumbersInArr.sum (numbersArr, thread);
    }
}
