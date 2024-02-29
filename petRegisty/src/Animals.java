public class Animals implements AnimalsInterface{
    public String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void addAnimal() {
        System.out.println("Добивить животное: ");


    }

    @Override
    public void getAnimals() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

