import java.util.Objects;

public class Predators extends Mammals {
    protected String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        if (typeOfFood == null || typeOfFood.isBlank() || typeOfFood.isEmpty()) {
            this.typeOfFood = "некорректное значение";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void hunting() {
        System.out.println("Кажется сейчас кто-то пострадает.");
    }

    @Override
    public void eat() {
        System.out.println("Я тоже кушаю!");
    }

    @Override
    public void go() {
        System.out.println("Я иду!");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(getTypeOfFood(), predators.getTypeOfFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfFood());
    }

    @Override
    public String toString() {
        return "Животное, среда обитания " + getLivingEnvironment() +
                ", зовут - " + getName() + '\n' + "относится к классу " +
                getClass() + ", тип пищи - " + typeOfFood + " возраст " + getAge() + " года.";
    }
}