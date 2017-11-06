package codeclan.com.raysmusicshop;

/**
 * Created by yanren on 06/11/2017.
 */

public class GuitarStrings extends Accessories{
    private int strengthLevel;

    public GuitarStrings(double buyingPrice, double sellingPrice, String description, int strengthLevel) {
        super(buyingPrice, sellingPrice, description);
        this.strengthLevel = strengthLevel;
    }
}
