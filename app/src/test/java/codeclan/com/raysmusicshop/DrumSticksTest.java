package codeclan.com.raysmusicshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 06/11/2017.
 */

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        this.drumSticks = new DrumSticks(10.21, 15.34, "hard", "plastic");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(10.21, this.drumSticks.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(15.34, this.drumSticks.getSellingPrice());
    }


}
