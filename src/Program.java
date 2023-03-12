import java.util.Iterator;
import java.util.Scanner;

public class Program {
    static void menu(Zoo[] animal){
        Scanner scan = new Scanner(System.in);

        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat(35,5,"gold","Olivka","Maine Coon",
                "+","gray-red-black","06.06.2022","long-fur"));
        zoo.addAnimal(new Cat(30,4,"green","Cezar","Siberian cat",
                "+","gray-red-black","06.06.2022","long-fur"));
        zoo.addAnimal(new Dog(58, 12, "light_blue", "Darsy",
                "husky", "+", "gray", "23.04.2020", "+"));
        zoo.addAnimal(new Wolf(55, 25, "green", "forest",
                "15.02.2022","not leader"));
        zoo.addAnimal(new Tiger(112, 204, "gold",
                "taiga", "30.10.2021"));
        zoo.addAnimal(new Hen(22, 2, "black", 1));
        zoo.addAnimal(new Stork(110, 4, "black", 2000));


        while (true) {
            System.out.println(" Выберите действие: \n 1 - Добавить животное\n " +
                    "2 - Удалить животное из Зоопарка\n 3 - Получить информацию о животном\n " +
                    "4 - Заставить животное издать звук\n 5 - Получить информацию обо всех животных\n " +
                    "6 - Заставить всех животных издать звук\n 0 - Выход");
            int num = scan.nextInt();
            if(num <= 0) {
                break;
            }
            switch (num) {
                case 1:
                    addNewAnimal(scan, zoo);
                    System.out.println("Животное добавлено в зоопарк\n");
                    break;
                case 2:
                    System.out.println("Введите номер животного: ");
                    int i = scan.nextInt();
                    zoo.removeAnimal(i);
                    System.out.println("Животное удалено из зоопарка\n");
                    break;
                case 3:
                    System.out.println("Введите номер животного: ");
                    i = scan.nextInt();
                    zoo.printOneAnimalInfo(i);
                    break;
                case 4:
                    System.out.println("Введите номер животного: ");
                    i = scan.nextInt();
                    zoo.getAnimalSound(i);
                    break;
                case 5:
                    zoo.printAllAnimalsInfo();
                    break;
                case 6:
                    zoo.getAllAnimalsSound();
                    break;
            }
        }
        scan.close();
        show(zoo);
    }

    static void addNewAnimal(Scanner scan, Zoo zoo) {
        System.out.println("Введите рост животного: ");
        Integer height = scan.nextInt();
        System.out.println("Введите вес животного: ");
        Integer weight = scan.nextInt();
        System.out.println("Введите цвет глаз животного: ");
        String eyesColor = scan.next();
        System.out.println();

        System.out.println("Выбери животное: \n1 - Аист\n2 - Волк\n3 - Кот\n" +
                "4 - Курица\n5 - Собака\n6 - Тигр\n");
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.println("Введите высоту полёта: ");
                int flyingHeight = scan.nextInt();
                zoo.addAnimal(new Stork(height, weight, eyesColor, flyingHeight));
                break;
            case 2:
                System.out.println("Введите среду обитания: ");
                String location = scan.next();
                System.out.println("Когда был найден: ");
                String dateOfFinding = scan.next();
                System.out.println("Вожак стаи? (+/-): ");
                String leader = scan.next();
                zoo.addAnimal(new Wolf(height, weight, eyesColor, location, dateOfFinding,
                        leader));
                break;
            case 3:
                System.out.println("Имя кота: ");
                String ownName = scan.next();
                System.out.println("Порода: ");
                String race = scan.next();
                System.out.println("Наличие прививок (+/-)?: ");
                String vaccinations = scan.next();
                System.out.println("Окрас: ");
                String furColor = scan.next();
                System.out.println("Дата рождения: ");
                String dateOfBirth = scan.next();
                System.out.println("Наличие шерсти (+/-): ");
                String isFur = scan.next();
                zoo.addAnimal(new Cat(height, weight, eyesColor, ownName, race, vaccinations,
                        furColor, dateOfBirth, isFur));
                break;
            case 4:
                System.out.println("Введите высоту полёта: ");
                flyingHeight = scan.nextInt();
                zoo.addAnimal(new Hen(height, weight, eyesColor, flyingHeight));
                break;
            case 5:
                System.out.println("Имя собаки: ");
                ownName = scan.next();
                System.out.println("Порода: ");
                race = scan.next();
                System.out.println("Наличие прививок (+/-): ");
                vaccinations = scan.next();
                System.out.println("Окрас: ");
                furColor = scan.next();
                System.out.println("Дата рождения: ");
                dateOfBirth = scan.next();
                System.out.println("Дрессирована (+/-)?: ");
                String hasTraining = scan.next();
                zoo.addAnimal(new Dog(height, weight, eyesColor, ownName, race, vaccinations,
                        furColor, dateOfBirth, hasTraining));
                break;
            case 6:
                System.out.println("Введите среду обитания: ");
                location = scan.next();
                System.out.println("Когда был найден: ");
                dateOfFinding = scan.next();
                zoo.addAnimal(new Tiger(height, weight, eyesColor, location, dateOfFinding));
                break;
            default:
                System.out.println("Животное:\t Неверный ввод!");
                break;
        }
    }

    public static void show(Zoo zoo){
        Iterator<Animal> iterator = zoo.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal instanceof Fly) {
                System.out.printf(animal.getClass().getSimpleName(), ": ");
                ((Fly) animal).fly();
            }
            if (animal instanceof Training) {
                System.out.printf(animal.getClass().getSimpleName(), ": ");
                ((Training) animal).training();
            }
            if (animal instanceof ShowKindness) {
                System.out.printf(animal.getClass().getSimpleName(), ": ");
                ((ShowKindness) animal).showKindness();
            }
        }
        System.out.println();
    }
}
