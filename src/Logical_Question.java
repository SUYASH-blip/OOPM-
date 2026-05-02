class A{
    public int marks;
    A(){
        System.out.println("Hello ");
    }
}
class B  {
    A obj = new A();
    B(){
        obj.marks = 25;
    }

}

class c{
    A obj = new A();
    c(){
       obj. marks = 150;
    }
    void getMarks(){
        System.out.println(obj.marks);
    }
}
public class Logical_Question{
    public static void main(String[] args) {
B b = new B();
c c = new c();
c.getMarks();
    }
}