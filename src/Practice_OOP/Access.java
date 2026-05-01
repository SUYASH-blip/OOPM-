package Practice_OOP;
import java.util.*;
 import  Package2.*;

 class Inherit extends Reverse{
Inherit(double value){
    this.value = value;
    System.out.println(this.value);
}

 }
public class Access{
    public static void main(String[] args) {

  Rectangle s1 = new Rectangle();
  Reverse r5 = new Reverse();
 Inherit i1 = new Inherit(2.5);




    Rectangle s2 = new Rectangle(25,"Green");
   Shapes.display();
   String[] arr = new String[5];
   arr[0] = "Hello";
   arr[1] = "Aloo";
   arr[2] = "Bhujiya ";
   arr[3] = "Khalo";
   arr[4] = "12345";
   main(arr,25);
    }

    public static void main(String[] args,int id) {
        System.out.println("BHAJIYA KHALE");
        System.out.println(Arrays.toString(args));
    }

    }
