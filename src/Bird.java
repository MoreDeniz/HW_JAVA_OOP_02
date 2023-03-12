/*
реализовать абстрактный класс "Птица", реализующий интерфейс животное,
 у которого будет защищённое поле:
1.Высота полёта
и метод:
2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
и защищённый конструктор:
3.Конструктор принимающий высоту полёта
И следующие классы-наследники:
1.Курица
2.Аист
 */

public abstract class Bird extends Animal implements Fly, MakeSound{
    private Integer flyingHeight;

    public Bird(Integer height, Integer weight, String eyesColor, Integer flyingHeight) {
        super(height, weight, eyesColor);
        this.flyingHeight = flyingHeight;
    }
    @Override
    public String toString(){
        return super.toString() + "; Высота полёта: " + flyingHeight + " м";
    }
}
