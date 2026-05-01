package Random;

import org.w3c.dom.ls.LSOutput;

public class Main extends Parent {

    int xyz;
    String Offset;

    Main(){
        System.out.println("Mains non parameterized");
    }

    @Override
    void display() {
        System.out.println("hello form child");
    }


    public static void main(String[] args) {



        Parent p1 = new Main();

        p1.salary = 25;

        System.out.println(p1 instanceof Main);

        p1.display();
    }
}
