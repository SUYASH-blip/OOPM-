package Practice_OOP;

public class Shapes {
    static int shape_id;
   static  String color;

    void draw() {

    }

  public  Shapes() {
        System.out.println("Hello from non parametrized");
    }

  public  Shapes(int id, String color) {
        this.shape_id = id;
        this.color = color;
    }

    static void display(){
        System.out.println(shape_id);
        System.out.println(color);
    }
}
