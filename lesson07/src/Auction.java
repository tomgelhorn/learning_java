import java.util.ArrayList;

public class Auction extends Listing {
    private int maxBids;
    private ArrayList<Bid> bids;

    public Auction(String title, String description, int maxBids) {
        super(title, description);
        this.maxBids = maxBids;
        this.bids = new ArrayList<>(maxBids);
    }

    @Override
    public int getCurrentPrice() {
        Bid lastBid = getLastBid();
        if (lastBid == null) {
            return 0;
        } else {
            return lastBid.getAmount();
        }
    }

    @Override
    public boolean isAvailable() {
        return bids.size() < maxBids;
    }

    @Override
    public boolean receiveBid(Bid bid) {
        Bid lastBid = getLastBid();
        if (!isAvailable() || bid.getAmount() <= getCurrentPrice()) {
            return false;
        }
        bids.add(bid);
        return true;
    }

    @Override
    public Bid getLastBid() {
        if (bids.isEmpty()) {
            return null;
        }
        return bids.get(bids.size() - 1);
    }
}
