public class Human extends Alive {

    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_JUMP_DISTANCE = 6;

    public Human(String name) {
        super(name);
    }

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(getName() + " пробежал " + distance + "м");
            return true;
        } else {
            System.out.println(getName() + " сошел с дистанции " + distance + "м");
            return false;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance <= MAX_JUMP_DISTANCE) {
            System.out.println(getName() + " прыгнул в высоту на " + distance + "м");
            return true;
        } else {
            System.out.println(getName() + " сошел с дистанции, не смог прыгнуть в высоту на " + distance + "м");
            return false;
        }
    }

    @Override
    public String toString() {
        return name + ", Максимальная высота прыжка: " + MAX_JUMP_DISTANCE
                + ", Максимальное расстояние бега: " + MAX_RUN_DISTANCE;
    }

}
