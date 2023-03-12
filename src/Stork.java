/*
2.Аист
 */

public class Stork extends Bird implements MakeSound, Fly{
    public Stork(Integer height, Integer weight, String eyesColor, Integer flyingHeight) {
        super(height, weight, eyesColor, flyingHeight);
    }

    @Override
    public void makeSound() {
        System.out.println("Tr-tr-tr-tr-tr-tr-tr-tr-tr-tr-tr-tr-tr");
    }

    @Override
    public void fly() {
        System.out.printf(": Я летаю на высоте %d м\n", 2000);
    }
}
