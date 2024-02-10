package References20240205.factory.EX01;

public class FactoryShapeDemo {
    public static void main(String[] args) {

            ShapeFactory createShape=new ShapeFactory();


            try{
                Shape shape=createShape.getShape("CIRCLE");
                shape.draw();
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }

    }
}
