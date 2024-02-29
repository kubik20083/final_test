package pets;

public class Cat extends PetsAbstract{
    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", animalSpecies='" + animalSpecies + '\'' +
                '}';
    }
}
