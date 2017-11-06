package codeclan.com.raysmusicshop;

import java.util.ArrayList;

import codeclan.com.raysmusicshop.Behaviour.Sellable;

/**
 * Created by yanren on 06/11/2017.
 */

public class Accessories implements Sellable{
    private double buyingPrice;
    private double sellingPrice;
    private String description;

    public Accessories(double buyingPrice, double sellingPrice, String description) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description =description;
    }

    @Override
    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
