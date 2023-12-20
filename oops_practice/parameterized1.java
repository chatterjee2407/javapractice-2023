
class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void printDetails(){
            System.out.println("Name:"+name);
            System.out.println("Age:" +age);
            System.out.println();
    }
}

public class parameterized1 {
    public static void main(String[] args) {

        Person first = new Person("Somanth",22) ;
        Person second = new Person("Julie",45);

            first.printDetails();
            second.printDetails();
    
}
    }

