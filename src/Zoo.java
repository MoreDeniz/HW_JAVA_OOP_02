/*
реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных
(массив, стек, очередь), в котором организовать приватный массив объектов-животных со следующими методами:
1.Добавить животное в зоопарк(добавляет новое животное в структуру данных, для массива использовать
 следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html ,
 для стека и очереди вы алгоритмы уже знаете)
2.Убирает животное с номером i из зоопарка(Использовать этот алгоритм
https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html
для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
3.Посмотреть информацию о животном с номером i
4.Заставить животное с номером i издать звук
5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
Предоставить пользователю консольный интерфейс(консольное меню), который позволяет пользователю
 добавлять новых животных в зоопарк, убирать животных из зоопарка,
 печатать информацию о конкретном животном(вводя его номер),
 печатать информацию о всех животных в зоопарке на данный момент,
 заставлять животное издавать звук(введя номер животное),
 заставлять издавать звук всех животных, которые на данный момент есть в зоопарке)
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo implements Iterable<Animal>{
    // приватный массив объектов-животных
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }
    // Добавить животное в зоопарк
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
    // Убирает животное с номером i из зоопарка
    public void removeAnimal(int i) {
        this.animals.remove(i - 1);
    }
    // Заставить животное с номером i издать звук
    public void getAnimalSound(int i) {
        this.animals.get(i - 1).makeSound();
        System.out.println();
    }
    // Заставить всех животных, ..., издать звук
    public void getAllAnimalsSound() {
        for (Animal animal: this.animals) {
            System.out.println(animal.getClass().getSimpleName() + ": ");
            animal.makeSound();
        }
        System.out.println();
    }
    // печатать информацию о конкретном животном(вводя его номер)
    public void printOneAnimalInfo(int number) {
        System.out.println(this.animals.get(number - 1).getClass().getSimpleName());
        System.out.println(this.animals.get(number - 1));
    }
    // Напечатать информацию о животных, которые есть на данный момент в зоопарке
    public void printAllAnimalsInfo() {
        System.out.println("\t\tTHE ZOO");
        for (int i = 0; i < this.animals.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.animals.get(i).getClass().getSimpleName());
            System.out.println(this.animals.get(i));
        }
        System.out.println();
    }
    @Override
    public Iterator<Animal> iterator() {
        return animals.iterator();
    }
}
