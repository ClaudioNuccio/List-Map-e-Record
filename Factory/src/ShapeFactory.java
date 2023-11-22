import java.util.Locale;



public class ShapeFactory {
    public static Shape shapeFactory(ShapeList whichShape) {
        Shape shape = null;
        switch (whichShape){
            case SQUARE:
                shape = new Square();
                shape.draw();
        break;
            case RECTANGLE:
                shape = new Rectangle();
                shape.draw();
        break;
            case CIRCLE:
                shape = new Circle();
              shape.draw();
        break;
            default:
                System.out.println("Shape not in the system");
    }
    return shape;
}
}
