package skeleton;

import java.util.HashMap;
import java.util.Map;

public class Checkout {
    // price_dict = {}
    private Map<String,Integer> priceDictionary = new HashMap<String, Integer>();
    private int total = 0;

    public void setItemPrice(String item, int itemPrice) {
        // price_dict[item] = itemPrice
        this.priceDictionary.put(item, itemPrice);
    }

    public void addItem(String item) {
        // itemPrice = price_dict[item]
        int itemPrice = priceDictionary.get(item);
        total += itemPrice;
    }

    public int getTotal() {
        return total;
    }
}
