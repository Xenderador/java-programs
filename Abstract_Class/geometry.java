/*
 * To create an abstract class named Shape that contains two integers and an
 * empty method named printArea. Provide three classes named Rectangle, Triangle
 * and Circle subclass that each one of the classes extends the Class Shape.
 * Each one of the classes contains only the method printArea() that prints the
 * area of Shape.
 */

package Abstract_Class;

abstract class Shape{
   public int x, y;
   public abstract void printArea();
}

class Rectangle extends Shape{
   public void printArea(){
    System.out.println("Area of rectangle :" + x * y);
   }
}

class Triangle extends Shape{
    public void printArea(){
        System.out.println("Area of triangle :" + (x * y) / 2);
    }
}

class Circle extends Shape{
    public void printArea(){
        System.out.println("Area of circle :" + (22 * x * x) / 7);
    }
}

public class geometry {
    public static void main(String[] args){
        Rectangle r =new Rectangle();
        r.x = 10;
        r.y = 20;
        r.printArea();

        System.out.println("-------------------------------------");

        Triangle t = new Triangle();
        t.x = 30;
        t.y = 35;
        t.printArea();

        System.out.println("-------------------------------------");

        Circle c = new Circle();
        c.x = 2;
        c.printArea();

        System.out.println("-------------------------------------");
    }
}
