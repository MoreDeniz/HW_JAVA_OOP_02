/*
3.Собака со свойством:
    3.1 Наличие дрессировки(доступным только для чтения внешним классам)
и методом:
    3.2 Дрессировать
 */

public class Dog extends DomesticAnimal implements MakeSound, ShowKindness, Training{
    private String hasTraining;
    public Dog(Integer height, Integer weight, String eyesColor, String ownName,
               String race, String vaccinations, String furColor, String dateOfBirth, String hasTraining) {
        super(height, weight, eyesColor, ownName, race, vaccinations, furColor, dateOfBirth);
        this.hasTraining = hasTraining;
    }

    public String getTraining(){
        return hasTraining;
    }

    @Override
    public void makeSound() {
        System.out.println("Bow-wow-wow");
    }

    @Override
    public String toString() {
        return super.toString() + "; Training: " + getTraining();
    }

    @Override
    public void showKindness() {
        System.out.println(": Вилять хвостом, лизать языком");
    }

    @Override
    public void training() {
        System.out.println(": Обучен командам");
    }
}
