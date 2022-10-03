import java.util.Objects;

public class Herbivores extends Mammals {
    //Травоядные
    protected String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        if (typeOfFood == null || typeOfFood.isBlank() || typeOfFood.isEmpty()) {
            this.typeOfFood = "некорректное значение";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void graze() {
        System.out.println("Я пасусь.");
// пастись
    }

    @Override
    public void eat() {

        System.out.println("Я ем!");
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
        if (!(o instanceof Herbivores)) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(getTypeOfFood(), that.getTypeOfFood());
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
