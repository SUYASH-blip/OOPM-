package Abstract_Interfaces;

public class Access2 extends Abstract1{
    @Override
    int sum(int a, int b) {
        return a+b;
    }
    @Override
    void display(){
        System.out.println("Hello ");
    }
}



/* 1. A class that has at least one abstract method must be
declared as a abstract class.

2.Abstract methods must be overridden in child classes.

3.We cannot directly create objects of an abstract class.

4.We can create constructors of an abstract class and call them
via child constructors(super).

5.We cannot create abstract constructors.

6.We cannot create abstract static method because static
method cant be overridden while abstract method must be overridden.

7.Reason for point 6:- Static method does not depend on objects
while the core concept of over-riding depends on objects
so that's why static methods cant be overridden.

8.Child class constructor always firstly calls super class
constructor weather it is hidden or explicitly defined by the
programmer.

9.We cannot create an abstract class final because it must
be overridden while the final keyword prevents it from being
overridden but we can declare final data members.

10.Abstract classes does not support multiple inheritance
because it is possible in an abstract class to have both abstract
as well as non -abstract methods so if a class inherits lets say two abstract
classes with same non -abstract methods void display then again
causing ambiguity for the compiler thats why.

11.if we have lets say two classes Parent and child child extends parent

and if we write parent p1 = new child();

then the lhs defines in which domain we can access things like in this case we cannot be able to
access child members

while the rhs side is basically for overriding purpose that object decides whose method
will be called dynamically.

12.An Interface can extends another interface .

13.We can give default implementation to a interface method but not to its all methods.

14.If you are providing a static method to a interface its body must be defined only declaration is not possible.
(just call it via the interface name).

15.In overriding methods the access modifier of the soecific method
that is being overridden must have equal or better access modifier
than the parent class.

16.The nested interface can be declared as public private
protected and default but the outer one can be only either
public or default.

*/