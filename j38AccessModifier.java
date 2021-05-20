
class Bank{
    int id;
    String Name;
    private int Money ; //So we not access this  Money var b/c it is private

    // if we make privat variable donot access directly 
    // access by any metheod

    // Access Mobney var by Metheod
    public void setMoney(int n){
        Money = n;
    }

    // return private Money Var by metheod
    public int getMoney(){
        return Money;
    }


}
public class j38AccessModifier{

    public static void main(String[] args){
        Bank ved = new Bank();

        ved.id = 1001;
        ved.Name = "Ved Prakash Gupta";
        // ved.Money = 10000000;
        ved.setMoney(100000000);
        int ved_mon = ved.getMoney();
        System.out.println("\n\nMoney in Bank : "+ved_mon);

    }
}