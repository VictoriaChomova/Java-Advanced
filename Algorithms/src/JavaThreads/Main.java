package JavaThreads;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread ("Thread1");
        MyThread thread2 = new MyThread ("Thread2");
        MyThread thread3 = new MyThread ("Thread3");
        MyThread thread4 = new MyThread ("Thread4");
        MyThread thread5 = new MyThread ("Thread5");

        thread1.start ();
        thread2.start ();
        thread3.start ();
        thread4.start ();
        thread5.start ();


        if (thread1.isAlive ()){
            System.out.println("yes 1");
        }
        if (thread2.isAlive()){
            System.out.println("yes 2");
        }
        if (thread3.isAlive()){
            System.out.println("yes 3");
        }
        if (thread4.isAlive()){
            System.out.println("yes 4");
        }
        if (thread5.isAlive()){
            System.out.println("yes 5");
        }
    }
}
