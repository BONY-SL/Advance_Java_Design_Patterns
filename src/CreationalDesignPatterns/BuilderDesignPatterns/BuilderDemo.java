package CreationalDesignPatterns.BuilderDesignPatterns;

public class BuilderDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        //student1.setId(1).setName("Danindu").setAddress("Beruwala");

        //student2.setId(2).setName("Pasindu").setAddress("Kaluthara");

        System.out.println(student1);
        System.out.println(student2);
    }
}
