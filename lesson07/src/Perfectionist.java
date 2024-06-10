public class Perfectionist extends Bidder {

    public Perfectionist(String name, int budget) {
        super(name, budget);
    }

    @Override
    public void shop(Ecove ecove) {
        ecove.getListings().stream()
                .filter(listing -> listing.isAvailable() && listing.getDescription().contains("erfect"))
                .forEach(listing -> {
                    if (bidOnListing(listing, getBudget() / 4)) {
                        System.out.println("[" + getName() + "] Invested " + listing.getCurrentPrice() + "€ in " + listing.getTitle());
                    } else {
                        System.out.println("[" + getName() + "] bid not enough.");
                    }
                });

    }

}
