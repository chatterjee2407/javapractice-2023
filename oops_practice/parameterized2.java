import java.lang.Math;
class Circle{
    private double radius;
    Circle( double radius){
        this.radius=radius;
    }

    public double perimeter (){
        return 2*Math.PI*radius;
    }
    public double area (){
        return Math.PI*radius*radius;
    }
}

class Rectangle{

    private double length ;
    private double breadth;

    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double perimeter (){
        return 2*(length+breadth);
    }
    public double area (){
        return length*breadth;
    }
}
class Square{

    private double side;

    Square(double side){
        this.side=side;
    }

     public double perimeter (){
        return 4*side;
    }
    public double area (){
        return side*side;
    }
}


public class parameterized2 {

    public static void main(String[] args) {
        double radius = 5;
        double length = 4;
        double breadth= 5;
        double side=7;

        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(length,breadth);
        Square square = new Square(side);

        System.out.println("Circle perimeter:" + circle.perimeter());
        System.out.println("Circle area:" + circle.area());
        System.out.println("Rectangle perimeter:" + rectangle.perimeter());
        System.out.println("Rectangle area:" + rectangle.area());
        System.out.println("Square Perimeter:" + square.perimeter());
        System.out.println("Square area:" + square.area());
         
    }
    
}
