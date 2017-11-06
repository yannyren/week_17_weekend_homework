package codeclan.com.raysmusicshop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import codeclan.com.raysmusicshop.Behaviour.Sellable;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 06/11/2017.
 */

public class ShopTest {
    Shop shop;
    ArrayList<Sellable> stock;
    Guitar guitar;
    GuitarStrings guitarStrings;
    
    @Before
    public void before (){
        this.stock = new ArrayList<>();
        this.shop = new Shop(stock);
        this.guitar = new Guitar(34.24, 45.33, "wood", "red", Type.STRING, 3);
        this.guitarStrings = new GuitarStrings(12.11, 15.11, "strong", 5);
    }

    @Test
    public void canAddItem(){
        this.shop.addItemToStock(guitar);
        assertEquals(1, this.stock.size());
    }

    @Test
    public void canRemoveItem(){
        this.shop.addItemToStock(guitar);
        this.shop.removeItemFromStock(guitar);
        assertEquals(0, this.stock.size());
    }

    @Test
    public void canCalProfit() {
        this.shop.addItemToStock(guitar);
        this.shop.addItemToStock(guitarStrings);
        assertEquals(14.09, shop.totalPotentialProfit(stock), 0.01);
    }

}
