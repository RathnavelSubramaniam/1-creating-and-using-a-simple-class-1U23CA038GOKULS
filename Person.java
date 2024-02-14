class Person1{
    String FirstName;
    String LastName;
    int Age;
Person1(String fn,String ln,int a){
    FirstName = fn;
    LastName = ln;
    Age = a;
}
String GetFullName(){
    return FirstName + " "+LastName;
}
}
public class Person{
    public static void main(String[] args){
        Person1 ob1 = new Person1("Jhon","Doe",30);
        Person1 ob2 = new Person1("Alice","Smith",25);
        System.out.println("Person 1:"+ob1.GetFullName());
        System.out.println("Person 2:"+ob2.GetFullName());

        double sum = ob1.Age + ob2.Age;
        double average = sum/2;
        System.out.println("Average Age:"+average);
    }
}