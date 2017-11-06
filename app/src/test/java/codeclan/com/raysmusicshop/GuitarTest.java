package codeclan.com.raysmusicshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by yanren on 06/11/2017.
 */

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        this.guitar = new Guitar(344.21, 500.21, "wood", "red", Type.STRING, 5);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(344.21, this.guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(500.21, this.guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, this.guitar.getType());
    }

}
