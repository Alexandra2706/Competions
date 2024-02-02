/**
 * Базовый класс для участников
 */

public abstract class Creator {
    protected String name;

    public Creator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract boolean run(int distance);

    abstract boolean jump(int distance);

    @Override
    public String toString() {
        return name;
    }
}
