
class BaseClass1 implements Runnable{
    public void run(){
        int i = 0;
        while(i < 500){
            System.out.println("BaseClass1 Metheod");
            i++;
        }
    }
}

class BaseClass2 implements Runnable{
    public void run(){
        int i = 0;
        while(i < 500){
            System.out.println("BaseClass2 Metheod");
            i++;
        }
    }
}


public class j53ThreadUsingRunnableInterface {
    public static void main(String[] args){
        // threading using Interface
        BaseClass1 BC1 = new BaseClass1();
        BaseClass2 BC2 = new BaseClass2();

        // import Thread 
        Thread BC1_T1 = new Thread(BC1);
        Thread BC2_T2 = new Thread(BC2);

        // Start using Thread
        BC1_T1.start();
        BC2_T2.start();
    }
}
