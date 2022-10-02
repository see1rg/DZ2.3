import java.util.Objects;

public class Amphibians extends Animals {

    private final String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "некорректное значение";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void hunting() {
        System.out.println("Пиф-паф!");
    }

    @Override
    public void eat() {
        System.out.println("Ам ням ням!");
    }

    @Override
    public void go() {
        super.go();
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians that)) return false;
        return Objects.equals(getLivingEnvironment(), that.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLivingEnvironment());
    }

    @Override
    public String toString() {
        return "Животное, среда обитания " + livingEnvironment +
                ", зовут - " + getName() + '\n' + "относится к классу " +
                getClass() + " возраст " + getAge() + " года.";
    }
}
