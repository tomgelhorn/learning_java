import java.util.ArrayList;

public class Ecove {
    private ArrayList<Listing> listings;

    public Ecove() {
        listings = new ArrayList<>();
    }

    public void addListing(Listing listing) {
        listings.add(listing);
    }

    public ArrayList<Listing> getListings() {
        return listings;
    }
}
