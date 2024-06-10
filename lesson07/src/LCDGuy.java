public class LCDGuy extends Bidder{
    public LCDGuy(String name, int budget) {
        super(name, budget);
    }

    @Override
    public void shop(Ecove ecove) {
       ecove.getListings().stream()
               .filter(listing -> listing.isAvailable() && listing.getTitle().contains("LCD"))
               .forEach(listing -> {
                   bidOnListing(listing, listing.getCurrentPrice()+1);
                   System.out.println("["+getName()+"] Invested " + listing.getCurrentPrice() + "€ in "+ listing.getTitle());}
               );
    }
}
