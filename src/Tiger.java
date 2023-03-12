/*
2.1 Тигр
 */

public class Tiger extends WildAnimal implements MakeSound{
    public Tiger(Integer height, Integer weight, String eyesColor, String location, String dateOfFinding){
        super(height, weight, eyesColor, location, dateOfFinding);
    }

    @Override
    public void makeSound() {
        System.out.println("Hrrrrrrrrrrrrrr");
    }
}
