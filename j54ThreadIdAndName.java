class interface_with_thread extends Thread{
    public interface_with_thread(String name){
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 30 ; i++){
            System.out.println(i);
        }
    }
}
public class j54ThreadIdAndName {
    public static void main(String[] args){

        // Thread Id and Name in Java
        interface_with_thread IWT = new interface_with_thread("th1"); // assign name of thread
        
        // print name and id of thread
        // id of every Thread is aunique
        System.out.printf("\n Name of thread : [%s] && Id of Thread is : [%d]" , IWT.getName(), IWT.getId());
        IWT.start();

    }

}