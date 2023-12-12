package Shap;

public class ShapeFactory {
    public Shape getShape(String typeShape){

        switch(typeShape){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Triangle":
                return new Triangle();
            default:
                System.out.println("Enter the right shape");
        }
        return null;
    }
}
