import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Ecove with "+ listings.size() + " listings:\n");
        for (Listing l : listings) {
            s.append("Listing: ");
            s.append(l.getTitle()+ ": "+ l.getDescription());
            if(l.isAvailable()){
                s.append(" (AVAILABLE) Current price: " + l.getCurrentPrice());
            }
            else{
                s.append(" (SOLD) To " + l.getLastBid().getOwner().getName() + " for " + l.getCurrentPrice());
            }
            s.append("\n");
        }
        return s.toString();
    }

    public void calculateCostForBidder(Bidder bidder){
        int biddersCost = getListings().stream()
                .filter(listing -> !listing.isAvailable() && listing.getLastBid().getOwner() == bidder)
                .map(listing -> listing.getCurrentPrice())
                .reduce(0, (i1, i2) -> i1 + i2);
        System.out.println(biddersCost);
    }

}
