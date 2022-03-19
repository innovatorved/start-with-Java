
// extend Thread class
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<1000){
            System.out.println("Thread1 is Running");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<2000){
            System.out.println("Thread2 is Running");
            i++;
        }
    }
}

public class j52MultiThreading {
    public static void main(String[] args){
        // multi threading
        MyThread1 T1 = new MyThread1();
        MyThread2 T2 = new MyThread2();

        // start threading in class by .start() metheod
        T1.start();
        T2.start();
    }
}