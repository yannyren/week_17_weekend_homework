package codeclan.com.raysmusicshop;

import codeclan.com.raysmusicshop.Behaviour.Sellable;

/**
 * Created by yanren on 06/11/2017.
 */

public class Instrument implements Sellable{

    private double buyingPrice;
    private double sellingPrice;
    private String material;
    private String colour;
    private Type type;

    public Instrument(double buyingPrice, double sellingPrice, String material, String colour, Type type) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.material = material;
        this.colour = colour;
        this.type = type;

    }


    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public Type getType() {
        return this.type;
    }
}
