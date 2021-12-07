package locationprice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocationPriceWebScraper {
    public static List<LocationPrice> getPrices() throws IOException {
        ArrayList<LocationPrice> fuelPriceList = new ArrayList<LocationPrice>();
        final Document doc = Jsoup.connect("https://www.roadrangerusa.com/fuel/check-fuel-prices").get();
        final Elements trs = doc.select("table tr");
        int index = 0;
        for (Element tr : trs) {
            if (index > 0) {
                final String location = tr.select("th").first().text();
                final String price = tr.select("td").last().text();
                LocationPrice locationPrice = new LocationPrice(price, location);
                fuelPriceList.add(locationPrice);
            }
            index++;
        }
        return fuelPriceList;
    }
}
