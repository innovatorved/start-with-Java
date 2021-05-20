class BankAccount{
    // always declare teh variable first
    // then use in constructor

    String Name;
    int id;
    private int Salary;
    // if we make class same name method inko at a time of incialization of class
    public BankAccount (String name , int id_in , int Sal){
        // this is Constuructor for this class// we can direct i=recieve value at time of initiaklise
        // by passing parameters in
        Name = name;
        id = id_in;
        Salary = Sal;
    }

    // we can also use metheod Overloading with constructor
    public BankAccount(){
        // constructor with no argument
        Name = "Puppet";
        id = 111;
        Salary = 0000000;
        System.out.println("This Is fake details creted by Computer !");
    }

    public void PrintDetails(){
        System.out.printf("\nYour Name : %s , Id is : %d , Salary : %d \n\n" , Name , id ,Salary);
    }
}

public class j39ConstructorAndConstructorOverloading{

    public static void main(String[] args){
        BankAccount ved = new BankAccount("Ved Prakash Gupta" , 101 , 1000000); // initialize with argus
        ved.PrintDetails();

        // initialise BankAccount Class withourt Argus
        System.out.println("initialise BankAccount Class withourt Argus");
        BankAccount aj = new BankAccount();
        aj.PrintDetails();

    }
}