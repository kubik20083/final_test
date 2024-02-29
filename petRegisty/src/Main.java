import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static List<Animals> animals = new ArrayList<>();
    private static List<Animals> removeAnimals = new ArrayList<>();
    public static void main(String[] args) {




while (true) {
    System.out.println("Меню: ");
    System.out.println("1) Добавить животное");
    System.out.println("2) Добавить команду животному");
    System.out.println("3) Список команд животного");
    System.out.println("4) Список животных");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберете: ");
    String chose = scanner.nextLine();

    switch (chose) {
        case "1": {
            addAnimal();
            break;
        }
        case "2": {
            addCommandAnimal();

            break;
        }
        case "3": {
            showCommandAnimal();
            break;
        }
        case "4": {
            showAnimal();
            break;
        }

    }
    }
    }

    private static void showCommandAnimal() {
    }

    private static void addCommandAnimal() {
    }

    private static void showAnimal() {
        int removeNum = 0;
        int num = 0;

        if(animals.size() != 0) {
            System.out.println("Список животных: ");
            for (Animals animals : animals) {
                num++;
                System.out.println(" " + num + ") " + animals.getName());
            }
        }
        else {
            System.out.println("В питомнике нет животных");
        }
        if (removeAnimals.size() != 0) {
            System.out.println("Переведенные животные: ");

            for (Animals animals : removeAnimals) {
                removeNum++;
                System.out.println(" " + num + ") " + animals.getName());
//                System.out.println("Переведен: " + animals.getRemoveReason());
            }
        }
        else {
            System.out.println("Нет переведенных животных");
        }
        System.out.println("Количество животных: " + num);
        System.out.println("Количество переведенных животных: " + removeNum);
    }

    private static void addAnimal() {
        int ageAnimal = 0;
        System.out.println("Добавить новое животное: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя животного: ");
        String name = scanner.nextLine();

        System.out.println("Возраст животного: ");
        String age = scanner.nextLine();
        try {
            ageAnimal = Integer.parseInt(age);  // Преобразование в целое число

            if (ageAnimal < 0) {
                try {
                    throw new AgeException("Ошибка Возраста!");
                } catch (AgeException e) {
                    System.err.println(e.getMessage());}
            }
        }
        catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

        Animals animals = new Animals(name, ageAnimal);
        animals.addAnimal();
        System.out.println(name + " теперь в списке животных!\n");
    }


    }
