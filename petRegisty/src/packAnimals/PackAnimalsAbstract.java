package packAnimals;

public abstract class PackAnimalsAbstract {
    private int id;
    private String name;
    private int Age;
    private String classAnimal = "packAnimal";

    public PackAnimalsAbstract(int id, String name, int age, String classAnimal) {
        this.id = id;
        this.name = name;
        Age = age;
        this.classAnimal = classAnimal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getClassAnimal() {
        return classAnimal;
    }

    public void setClassAnimal(String classAnimal) {
        this.classAnimal = classAnimal;
    }
}
