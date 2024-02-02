import java.util.Random;

public class Road implements Obstacle {

    private int size;
    Random rn = new Random();

    private final String OBJECT = "Дорожка";
    private final int MIN_LENGHT = 50;
    private final int MAX_LENGHT = 500;

    public Road() {
        this.size = rn.nextInt(MAX_LENGHT - MIN_LENGHT + 1) + MIN_LENGHT;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Дорожка длиной " + size;
    }

    @Override
    public String getObject() {
        return OBJECT;
    }
}
