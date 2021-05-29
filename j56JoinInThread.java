class ex_set_thread_priority1 extends Thread{
    public ex_set_thread_priority1(String name){
        // Constructor in ex_set_thread_priority class
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i < 40){
            // return Thread Name
            System.out.println("Thread1 Myame is : "+this.getName());
            i++;
        }
    }
}
class ex_set_thread_priority2 extends Thread{
    public ex_set_thread_priority2(String name){
        // Constructor in ex_set_thread_priority class
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i < 20){
            // return Thread Name
            System.out.println("On I = "+i);
            i++;
        }
    }
}

public class j56JoinInThread {
    public static void main(String[] args){
        ex_set_thread_priority1 ESTP1 = new ex_set_thread_priority1("Thread1");
        ex_set_thread_priority2 ESTP2 = new ex_set_thread_priority2("Thread2");

        /*
            Join Metheod
            - if you want to run only one thread in any situation and stoip other thread
            we use joi metheod
            
            - join metheod always use in try block b/c if the Thread previously kill then this block makes an Error

        */
        // ESTP1.start();
        ESTP2.start();

        try {
            ESTP2.join();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        ESTP1.start();


    }
}
