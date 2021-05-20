class Hello{
    // this is class remember we donot add pub;lic in initialixzing any class
    int id;
    String name;
    int Salary;

    // create metheod inside the Class
    public void PrintDetails(){
        System.err.printf("\nName is [%s] and Id is [%d]\n" ,name ,  id);
    }

    // Return Salary Function
    public int ReturnSalary(){
        //System.out.println(Salary);
        return Salary;
    }
}

public class j37CreateClass {

    public static void main(String[] args){
        System.out.println("Initialize Custom Class Hello");
        Hello Ved = new Hello();

        // Setting Attributes
        Ved.id = 559;
        Ved.Salary = 150000;
        Ved.name = "Ved Prakash Gupta";

        Ved.PrintDetails(); // metheod in custom class
        //System.out.printf("Name is [%s] and Id is [%d]" ,Ved.name ,  Ved.id);

        int Ved_sal = Ved.ReturnSalary(); //calling metheod avail in HEllo class
        System.err.println("Ved Salary is : "+Ved_sal);



    }
}