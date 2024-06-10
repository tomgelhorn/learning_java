public class BulkBuyer extends Bidder{

    public BulkBuyer(String name, int budget) {
        super(name, budget);
    }

    @Override
    public void shop(Ecove ecove) {
        int allItems = ecove.getListings().stream()
                .filter(listing -> listing.isAvailable())
                .map(listing -> listing.getCurrentPrice())
                .reduce(0, (i1, i2) -> i1 + i2);
    if (allItems <= getBudget()) {
        ecove.getListings().stream()
                .filter(listing -> listing.isAvailable())
                .forEach(listing -> {
                    bidOnListing(listing, listing.getCurrentPrice()+1);
                    System.out.println("["+getName()+"] Invested " + listing.getCurrentPrice() + "€ in "+ listing.getTitle());}
                );
    }
    }

}
