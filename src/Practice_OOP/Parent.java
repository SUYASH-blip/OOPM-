package Practice_OOP;

public class Parent {

  public  int id;
   public   String name;
 private double salary;

 static void sum(Parent obj){

 obj.greet();
 }
 
 void greet(){
     System.out.println("hello");
 }

 Parent(){
     System.out.println("Hello From Parent class");
 }

   public Parent(int id , String name, double salary){
        System.out.println("New Employee Created!!");
        this.id = id;
        this.name = name;
        this.salary = salary;

       System.out.println("Employee Id    :"+    this.id);
       System.out.println("Employee Name  :"+  this.name );
       System.out.println("Employee Salary:"+this.salary);
    }
}
