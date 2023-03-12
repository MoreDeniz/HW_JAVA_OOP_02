/*
2.Дикое животное со следующими свойствами:
    2.1 Место обитания - location
    2.2 Дата нахождения - dateOfFinding
 */

public abstract class WildAnimal extends Animal implements MakeSound{
    private String location;
    private String dateOfFinding;

    public WildAnimal(Integer height, Integer weight, String eyesColor,
                      String location, String dateOfFinding) {
        super(height, weight, eyesColor);
        this.location = location;
        this.dateOfFinding = dateOfFinding;
    }

    String getLocation(){
        return location;
    }
    String getDateOfFinding(){
        return dateOfFinding;
    }
    @Override
    public String toString() {
        return super.toString() + "; Location: " + getLocation() + "; Day of finding: " + getDateOfFinding();
    }
}