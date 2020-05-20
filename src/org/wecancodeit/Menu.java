package org.wecancodeit;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<>();
        menu.put("Spaghetti", 8.97);
        menu.put("Lasgna", 10.98);
        menu.put("Pizza", 15.50);
        menu.put("Caesar Salad", 7.00);
        menu.put("Kale Salad", 7.00);
        System.out.println("The price of Spaghetti is $"
                + menu.get("Spaghetti"));
        System.out.println("Your current menu has " +
                menu.size() + " items.");
        menu.put("Bottle of Champagne", 200.00);
        menu.put("Bottle of Vintage Wine", 175.00);
        System.out.println("Price of Champagne: $"+
                menu.get("Bottle of Champagne"));
        System.out.println("Price of Vintage Wine: $"+
                menu.get("Bottle of Vintage Wine"));
        System.out.println("We have champagne is: " +
                menu.containsKey("Bottle of Champagne"));
        System.out.println("We have a menu item priced" +
                " at $15.50 is:"+ menu.containsValue(15.50));
        System.out.println("We have a Kale Salad is:" +
                menu.containsKey("Kale Salad"));
        menu.remove("Kale Salad");
        System.out.println("We have a Kale Salad is:" +
                menu.containsKey("Kale Salad"));
        menu.clear();
        System.out.println("The menu is empty:" +
                menu.isEmpty());
    }
}
