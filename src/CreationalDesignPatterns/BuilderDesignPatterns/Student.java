package CreationalDesignPatterns.BuilderDesignPatterns;

public class Student {
    private int id;
    private String name;
    private String address;

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {

        return id+" "+name+" "+address;
    }
}
