import java .io.*;


class Somnath {

    String Name; //data memebers to be printed 
    int id;
     Somnath(String Name, int id){          // constructor made with parameter given to  initialize the object 

        this.Name=Name;
        this.id=id;   // reference of the variable 
    }
}

public class parameterized {
    public static void main(String[] args) {
        
        Somnath somu = new Somnath ("Somnath",32);

        System.out.println("My Name is: " +somu.Name + "    id is: " + somu.id);
    }
}
