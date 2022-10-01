import java.util.Objects;

public class Mammals extends Animals {
    //млекопитающие
    private String livingEnvironment;
    private int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "некорректное значение";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

        if (speed < 0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
    }

    public void walk() {
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }
}