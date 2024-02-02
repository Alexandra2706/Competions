import java.util.Random;

public class Wall implements Obstacle {

    private int size;
    private Random rn = new Random();
    private final String OBJECT = "Стена";
    private final int MIN_HEIGHT = 1;
    private final int MAX_HEIGHT = 10;

    public Wall() {
        this.size = rn.nextInt(MAX_HEIGHT - MIN_HEIGHT + 1) + MIN_HEIGHT;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Стена высотой " + size;
    }

    @Override
    public String getObject() {
        return OBJECT;
    }
}
