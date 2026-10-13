/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author layan
 */
import java.awt.*;

public class GoldenFood extends Food {
    public GoldenFood(Point position) { super(position); }

    @Override public FoodType getType()      { return FoodType.GOLDEN; }
    @Override public int getPoints()         { return 5; }
    @Override public Color getColor()        { return new Color(255, 215, 0); }
    @Override public String getEmoji()       { return "⭐"; }
    @Override public String getDescription() { return "Golden Apple - 5 Points!"; }
}