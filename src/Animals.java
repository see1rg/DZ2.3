public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "некорректное значение";
        } else {
            this.name = name;
        }
        if (age < 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public void eat() {

    }

    public void sleep() {

    }

    public void go() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

