package codeclan.com.raysmusicshop;

/**
 * Created by yanren on 06/11/2017.
 */

public class DrumSticks extends Accessories {
    private String material;

    public DrumSticks(double buyingPrice, double sellingPrice, String description, String material) {
        super(buyingPrice, sellingPrice, description);
        this.material = material;

    }



}
