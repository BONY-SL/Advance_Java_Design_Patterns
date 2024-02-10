package References20240205.factory.EX01;

public class ShapeFactory {

    public Shape getShape(String shpaeName)throws NullPointerException{
        if(shpaeName==null){
            return null;
        } else if (shpaeName.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }else if(shpaeName.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shpaeName.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }else {
            return null;
        }
    }
}
