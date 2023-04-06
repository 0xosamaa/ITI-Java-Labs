import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        ArrayList <Shape> shapes = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(circle);
        shapes.add(circle);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(rectangle);
        shapes.add(rectangle);
        shapes.add(rectangle);
        DrawShapes.run(shapes);
    }
}
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class DrawShapes{
    public static void run(ArrayList<? extends Shape> shapes){
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
