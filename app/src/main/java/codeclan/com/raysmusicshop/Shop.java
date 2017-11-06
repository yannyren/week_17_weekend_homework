package codeclan.com.raysmusicshop;

import java.util.ArrayList;

import codeclan.com.raysmusicshop.Behaviour.Sellable;

/**
 * Created by yanren on 06/11/2017.
 */

public class Shop {
    private ArrayList<Sellable> stock;

    public Shop (ArrayList<Sellable> stock) {
        this.stock = stock;
    }

    public void addItemToStock(Sellable sellable) {
        stock.add(sellable);
    }

    public void removeItemFromStock(Sellable sellable) {
        stock.remove(sellable);
    }

    public double totalPotentialProfit(ArrayList<Sellable> stock) {
        double profit = 0;
        for(Sellable item : stock ) {
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
