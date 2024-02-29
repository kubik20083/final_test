package packAnimals;

public class Donkey extends PackAnimalsAbstract {
    public Donkey(int id, String name, int age, String classAnimal) {
        super(id, name, age, classAnimal);
    }

    @Override
    public String toString() {
        return "Donkey{}";
    }
}
