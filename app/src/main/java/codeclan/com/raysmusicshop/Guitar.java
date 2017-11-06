package codeclan.com.raysmusicshop;

import codeclan.com.raysmusicshop.Behaviour.Playable;

/**
 * Created by yanren on 06/11/2017.
 */

public class Guitar extends Instrument implements Playable{
    private int numOfString;

    public Guitar(double buyingPrice, double sellingPrice, String material, String colour, Type type, int numOfString){
        super(buyingPrice, sellingPrice, material, colour, type);
        this.numOfString = numOfString;

    }


    @Override
    public String play() {
        return "Guitar plays";
    }


}
