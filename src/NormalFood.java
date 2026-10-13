
import java.awt.*;

public class NormalFood extends Food {

    public NormalFood(Point position) {
        super(position);
    }

    @Override
    public Food.FoodType getType() {
        return Food.FoodType.NORMAL;
    }

    @Override
    public int getPoints() {
        return 1;
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public String getEmoji() {
        return "🍎";
    }

    @Override
    public String getDescription() {
        return "Apple - 1 Point";
    }
}
