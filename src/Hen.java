/*
1.Курица
 */

public class Hen extends Bird implements MakeSound, Fly{
    public Hen(Integer height, Integer weight, String eyesColor, Integer flyingHeight) {
        super(height, weight, eyesColor, flyingHeight);
    }

    @Override
    public void makeSound() {
        System.out.println("Ko-ko-ko");
    }

    @Override
    public void fly() {
        System.out.println(": Я могу взлететь на забор");
    }
}
