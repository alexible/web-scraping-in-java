import locationprice.LocationPrice;
import locationprice.LocationPriceWebScraper;

import java.io.IOException;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {
        List<LocationPrice> prices = LocationPriceWebScraper.getPrices();
        System.out.println(prices);
    }
}
