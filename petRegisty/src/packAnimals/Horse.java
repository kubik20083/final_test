package packAnimals;

public class Horse extends PackAnimalsAbstract{
    public Horse(int id, String name, int age, String classAnimal) {
        super(id, name, age, classAnimal);
    }

    @Override
    public String toString() {
        return "Horse{}";
    }
}
