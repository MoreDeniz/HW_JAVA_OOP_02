/*
1.Кот со свойством:
    1.1 Наличие шерсти (доступным только для чтения внешним классам)
 */

public class Cat extends DomesticAnimal implements MakeSound, ShowKindness{
    private String isFur;
    public Cat(Integer height, Integer weight, String eyesColor, String ownName,
               String race, String vaccinations, String furColor, String dateOfBirth, String isFur) {
        super(height, weight, eyesColor, ownName, race, vaccinations, furColor, dateOfBirth);
        this.isFur = isFur;
    }

    String getIsFur() {
        return isFur;
    }

    @Override
    public void makeSound() {
        System.out.println("Mrrr-Myau");
    }

    @Override
    public String toString() {
        return super.toString() + "; Is fur: " + getIsFur();
    }


    @Override
    public void showKindness() {
        System.out.println(": Тереться о ноги и мурлыкать");
    }
}
