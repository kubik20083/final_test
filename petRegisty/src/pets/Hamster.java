package pets;

public class Hamster extends PetsAbstract{
    public Hamster() {
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "id=" + id +
                ", animalSpecies='" + animalSpecies + '\'' +
                '}';
    }
}
