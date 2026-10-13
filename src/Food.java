
import java.awt.*;

public abstract class Food {

    public enum FoodType { NORMAL, GOLDEN, BONUS, SPEED }

    protected final Point position;
    protected final long spawnTime;

    protected Food(Point position) {
        this.position = position;
        this.spawnTime = System.currentTimeMillis();
    }

    public Point getPosition() { return position; }

    public abstract FoodType getType();
    public abstract int getPoints();
    public abstract Color getColor();
    public abstract String getEmoji();
    public abstract String getDescription();

    public boolean isExpired()     { return false; }
    public long getRemainingTime() { return 0; }
    public boolean hasEffect()     { return false; }
}