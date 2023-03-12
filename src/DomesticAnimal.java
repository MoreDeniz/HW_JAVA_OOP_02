/*
1.Домашнее животное со следующими свойствами:
    1.1 Кличка - ownName
    1.2 Порода - race
    1.3 Наличие прививок - vaccinations
    1.4 Цвет шерсти - furColor
    1.5 Дата рождения - DateOfBirth
И методами:
    1.5 Проявлять ласку - showKindness()
 */

public abstract class DomesticAnimal extends Animal implements MakeSound, ShowKindness{
    private String ownName;
    private String race;
    private String vaccinations;
    private String furColor;
    private String dateOfBirth;

    public DomesticAnimal(Integer height, Integer weight, String eyesColor, String ownName,
                          String race, String vaccinations, String furColor, String dateOfBirth) {
        super(height, weight, eyesColor);
        this.ownName = ownName;
        this.race = race;
        this.vaccinations = vaccinations;
        this.furColor = furColor;
        this.dateOfBirth = dateOfBirth;
    }

    String getOwnName(){
        return ownName;
    }
    String getRace(){
        return race;
    }
    String getVaccinations(){
        return vaccinations;
    }
    String getFurColor(){
        return furColor;
    }
    String getDateOfBirth(){
        return dateOfBirth;
    }
    @Override
    public String toString() {
        return super.toString() + "; Own name: " + getOwnName() + "; Race: " + getRace() +
                "; Vaccinations: " + getVaccinations() + "; Fur color: " + getFurColor() +
                "; Date of Birth: " + getDateOfBirth();
    }

    public abstract void showKindness();
}

