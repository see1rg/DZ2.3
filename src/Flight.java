import java.util.Objects;

public class Flight extends Birds {
    private String movementType;

    public Flight(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        if (movementType == null || movementType.isBlank() || movementType.isEmpty()) {
            this.movementType = "некорректное значение";
        } else {
            this.movementType = movementType;
        }
    }

    public void fly() {
        System.out.println("I believe I can fly!");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        if (!super.equals(o)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getMovementType(), flight.getMovementType());
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