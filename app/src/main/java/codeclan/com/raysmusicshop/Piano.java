package codeclan.com.raysmusicshop;

import codeclan.com.raysmusicshop.Behaviour.Playable;

/**
 * Created by yanren on 06/11/2017.
 */

public class Piano extends Instrument implements Playable {

    private int numberOfKeys;

    public Piano(double buyingPrice,
                 double sellingPrice,
                 String material,
                 String colour,
                 Type type, int numberOfKeys){
        super(buyingPrice, sellingPrice, material, colour, type);
        this.numberOfKeys = numberOfKeys;

    }


    @Override
    public String play() {
        return "Piano plays";
    }

}
