import java.util.Objects;

public class Flightless extends Birds {
    private String movementType;

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        if (movementType == null || movementType.isBlank() || movementType.isEmpty()) {
            this.movementType = "некорректное значение";
        } else {
            this.movementType = movementType;
        }
    }

    public void walk() {

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        System.out.println("топ топ топ!");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(getMovementType(), that.getMovementType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMovementType());
    }

    @Override
    public String toString() {
        return "Животное, среда обитания " + getLivingEnvironment() +
                ", зовут - " + getName() + '\n' + "относится к классу " +
                getClass() + ", тип передвижения - " + movementType + ".";
    }
}