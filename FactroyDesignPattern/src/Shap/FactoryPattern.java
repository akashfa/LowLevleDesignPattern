package Shap;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        //Get object of circle and call drow method
        Shape circle=shapeFactory.getShape("Circle");
        circle.drow();
        //Get object of triangle and call method drow
        Shape triangle=shapeFactory.getShape("Triangle");
        triangle.drow();
        //Get object of rectangle and call of drow method
        Shape rectangle=shapeFactory.getShape("Rectangle");
        rectangle.drow();


    }
}
