package Practice_OOP;

public class Child extends Parent{

    Child(){

        System.out.println("Hello from child class");
    }
    Child(int id,String name,double salary){
       // super(id,name,salary);
    }

    public static void main(String[] args) {
       // Child c1 = new Child();
        Child c2 = new Child(21,"Suyash",90000);
    }

}


// ---------- Very imp concept ---------

//agar parent class me non parameter constructor nhi he or child me he
//to java pehle super call karega normally like [super()] but then jvm dekhega ki parent class me to
//        non parameter constructor he hi nhi
//
//Conclusion :- is case me child class ka non parameter constructor sirf super use karke parent ke
//parametrized ko hi call kar sakta he.


/* java by default child class ke constructor me sirf non parametrized
parent constructor ko hi call kar sakta he.
 */
