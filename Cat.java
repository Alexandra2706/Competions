public class Cat extends Alive {
    private String color;

    private final int MAX_RUN_DISTANCE = 200;
    private final int MAX_JUMP_DISTANCE = 7;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(getName() + " пробежал " + distance + "м");
            return true;
        } else {
            System.out.println(getName() + " сошел с дистанции " + distance + "м. Я котик. У меня лапки");
            return false;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance <= MAX_JUMP_DISTANCE) {
            System.out.println(getName() + " прыгнул в высоту на " + distance + "м");
            return true;
        } else {
            System.out.println(getName() + " сошел с дистанции, не смог прыгнуть в высоту на " + distance
                    + "м. Я котик. У меня лапки");
            return false;
        }
    }

    @Override
    public String toString() {
        return name + " " + color + ", Максимальная высота прыжка: " + MAX_JUMP_DISTANCE
                + ", Максимальное расстояние бега: " + MAX_RUN_DISTANCE;
    }

}
