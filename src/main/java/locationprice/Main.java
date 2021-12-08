package locationprice;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<LocationPrice> prices = LocationPriceWebScraper.getPrices();
        System.out.println(prices);
    }
}
