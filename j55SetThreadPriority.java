class ex_set_thread_priority extends Thread{
    public ex_set_thread_priority(String name){
        // Constructor in ex_set_thread_priority class
        super(name);
    }
    @Override
    public void run(){
        while (true){
            // return Thread Name
            System.out.println("Thread MName is : "+this.getName());
        }
    }
}

public class j55SetThreadPriority {
    public static void main(String[] args){
        // we only able to set the priority 
        // exection totally dependd upon OS & CPU availability which scheduling algorithm used
        // Set Thread Priority
        ex_set_thread_priority EXTP1 = new ex_set_thread_priority("t1"); 
        ex_set_thread_priority EXTP2 = new ex_set_thread_priority("t2 :- set MinPriority");  // Set Minimum priority
        ex_set_thread_priority EXTP3 = new ex_set_thread_priority("t3");
        ex_set_thread_priority EXTP4 = new ex_set_thread_priority("t4 :- set MaxPriority"); // set high priority on this

        EXTP4.setPriority(10); // int priority // set max
        EXTP2.setPriority(1); // int priority // set max

        /*
        priority range from 1 to 10
        -------------------- already define variable
        Thread.MAX_PRIORITY = 10
        Thread.MIN_PRIORITY = 1

        */
        // lets start all threads & see the Output
        EXTP1.start();
        EXTP2.start();
        EXTP3.start();
        EXTP4.start();


    }
}
