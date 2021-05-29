class check_thread_exception extends Thread{
    public check_thread_exception(String name){
        super(name);
    }

    @Override
    public void run(){
        // set
        while(true){
            System.out.println("My Name is : "+this.getName());

            try {
                // it sleeps 455 time after execution of  this thread then after completeion they re execute
                Thread.sleep(455);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class check_thread_exception_basic_thread extends Thread{
    public check_thread_exception_basic_thread(String name){
        super(name);
    }
    
    @Override
    public void run(){
        // set
        int i = 0;
        while(i < 20){
            System.out.println("Genral other thread");
            i++;
        }
    }
}

public class j57InterpretInThread {
    public static void main(String[] args){

        check_thread_exception CTE1 = new check_thread_exception("It_Is_Thread_1");
        check_thread_exception_basic_thread CTEBT1 = new check_thread_exception_basic_thread("It_Is_Basic_Thread");
        
        // Start Thread
        CTEBT1.start();
        CTE1.start();
        
    }
}
