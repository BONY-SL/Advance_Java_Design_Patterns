package CreationalDesignPatterns.PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static
    {
        colorMap.put("blue", new BlackColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColor(String colorName)
    {
        return (Color) colorMap.get(colorName).clone();
    }
}
