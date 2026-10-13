
import java.awt.Point;

public class FoodFactory {

    public static Food createFood(Food.FoodType type, Point position) {
        switch (type) {
            case GOLDEN:
                return new GoldenFood(position);
            case BONUS: 
                return new BonusFood(position);
            case SPEED: 
                return new SpeedFood(position);
            case NORMAL:
            default:     return new NormalFood(position);
        }
    }
}
