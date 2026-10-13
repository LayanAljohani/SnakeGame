
import java.awt.*;

public class BonusFood extends Food {

    private static final long BONUS_DURATION = 5000;

    public BonusFood(Point position) {
        super(position);
    }

    @Override
    public FoodType getType() {
        return FoodType.BONUS;
    }

    @Override
    public int getPoints() {
        return 3;
    }

    @Override
    public Color getColor() {
        return new Color(138, 43, 226);
    }

    @Override
    public String getEmoji() {
        return "💎";
    }

    @Override
    public String getDescription() {
        return "Bonus Diamond - 3 Points!";
    }

    @Override
    public boolean isExpired() {
        return (System.currentTimeMillis() - spawnTime) > BONUS_DURATION;
    }

    @Override
    public long getRemainingTime() {
        long remaining = BONUS_DURATION - (System.currentTimeMillis() - spawnTime);
        return remaining > 0 ? remaining : 0;
    }
}
