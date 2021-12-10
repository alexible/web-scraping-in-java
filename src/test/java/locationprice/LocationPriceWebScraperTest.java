package locationprice;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.security.PublicKey;

import static org.junit.Assert.assertEquals;

//import org.junit.Assert;

public class LocationPriceWebScraperTest {

    @Test
    public void testPriceLocationListNotEmpty() throws IOException {
        int count = LocationPriceWebScraper.getPrices().size();
        assertNotEquals(0, count);
    }

//    @Test
//    public void testGetUrl() {
//        assertEquals("https://www.roadrangerusa.com/fuel/check-fuel-prices", "https://www.roadrangerusa.com/fuel/check-fuel-prices");
//    }

    @Test
    public void testFirstLocationNotNull() throws IOException {
        LocationPrice locationPrice = LocationPriceWebScraper.getPrices().get(0);
        String location = locationPrice.getLocation();
        assertNotNull(location);
    }

    @Test
    public void testFirstPriceNotNull() throws IOException {
        LocationPrice locationPrice = LocationPriceWebScraper.getPrices().get(0);
        String price = locationPrice.getPrice();
        assertNotNull(price);
    }

}
