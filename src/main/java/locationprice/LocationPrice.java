package locationprice;

public class LocationPrice {
    private String price;
    private String location;

    public LocationPrice(String price, String location) {
        this.price = price;
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public String toString() {
        return location + " " + price;
    }
}

