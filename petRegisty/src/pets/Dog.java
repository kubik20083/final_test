package pets;

public class Dog extends PetsAbstract{
    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", animalSpecies='" + animalSpecies + '\'' +
                '}';
    }
}
