package BitonicSearchInTwoThreads;

public class MyThread extends Thread{
    int[] numbersArr;
    int numberWanted;
    int thread;


    public MyThread(int[] numbersArr, int numberWanted, int thread) {
        this.numbersArr = numbersArr;
        this.numberWanted = numberWanted;
        this.thread = thread;
    }

    public void run() {
       BitonicSearchInTwoThreads.search (this.numbersArr, this.numberWanted, this.thread);

    }
}
