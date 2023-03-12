/*
4.Волк со свойством:
    4.1 Вожак стаи(доступным только для чтения внешним классам)
 */

public class Wolf extends WildAnimal implements MakeSound{
    private String leader;
    public Wolf(Integer height, Integer weight, String eyesColor,
                String location, String dateOfFinding, String leader) {
        super(height, weight, eyesColor, location, dateOfFinding);
        this.leader = leader;
    }

    String getLeader(){
        return leader;
    }
    @Override
    public void makeSound() {
        System.out.println("Wououuuuu!");
    }

    @Override
    public String toString() {
        return super.toString() + "; Is leader: " + getLeader();
    }
}
