public abstract class Bidder {
    private String name;
    private int budget;

    public Bidder(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }
    public abstract void shop(Ecove ecove);
    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public boolean bidOnListing(Listing listing, int amount) {
        if (!listing.isAvailable() || amount > budget) {
            return false;
        }
        Bid bid = new Bid(amount, this);
        if (listing.receiveBid(bid)) {
            if (!listing.isAvailable()) {
                // got the item
                budget -= amount;
            }
            return true;
        }
        return false;
    }
}
