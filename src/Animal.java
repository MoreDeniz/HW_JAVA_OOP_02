/*
реализовать интерфейс "Животное" со следующими полями:
1.Рост животного - height
2.Вес животного - weight
3.Цвет глаз животного - eyesColor
И методы:
1.Издать звук
2.Напечатать информацию о животном
 */
public abstract class Animal {
    private Integer height;
    private Integer weight;
    private String eyesColor;

    public Animal(Integer height, Integer weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public Integer getHeight() {
        return height;
    }
    public Integer getWeight() {
        return weight;
    }
    public String getEyesColor() {
        return eyesColor;
    }

    public abstract void makeSound();

    public String toString(){
        return String.format("Height: %d;  Weight: %d; Eyes color: %s",
                getHeight(), getWeight(), getEyesColor());
    }

//    public abstract void fiy();
}
