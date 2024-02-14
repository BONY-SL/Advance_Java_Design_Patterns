package References20240205.Strategy.EX01;

public class VersionDemo {
    public static void main(String[] args) {



        VersionContex Ex = new VersionContex(new StepByStepConcrete());


        //VersionContex Ex = new VersionContex(new FastAndDirtyConcreate());


        try {
            System.out.println("Answer: "+Ex.calculate(2, 3));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Ex.upgrade();
        try {
            System.out.println();
            System.out.println("After upgrade: " + Ex.calculate(2, 3));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Ex.downgrade();
        try {
            System.out.println();
            System.out.println("After downgrade: " + Ex.calculate(2, 3));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
