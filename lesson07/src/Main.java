public class Main {
    public static void main(String[] args) {
        Ecove ecove = new Ecove();
        ecove.addListing(new Auction("Corsehr SF750", "Good luck finding another one", 2));
        ecove.addListing(new BuyItNow("Gigabit B550I", "Used condition, missing chipset cooler", 115));
        ecove.addListing(new Auction("AND Rizen 5600X", "Perfect condition, the bent pins are not used anyway", 8));
        ecove.addListing(new Auction("AND Rizen 5800X", "Package will only contain depicted items", 6));
        ecove.addListing(new Auction("Levono Laptop", "Defective, parts-only", 13));
        ecove.addListing(new Auction("Samsnug C34H890WJU", "Besides major panel damage in perfect condition", 12));
        ecove.addListing(new BuyItNow("SUS 1080Ti Strix", "Dustier than the back of your washing machine", 200));
        ecove.addListing(new BuyItNow("Sunny PSP-2004", "Don't have a battery so can't check if it works, just trust me", 45));
        ecove.addListing(new BuyItNow("NV156FHM-N4K 15,6\" IPS", "New, tested beforehand", 59));
        ecove.addListing(new BuyItNow("NV156FHM-N4K mini HDMI EDP", "Only 120Hz not 144Hz", 25));

        System.out.println("Scenario 1:");
        Bidder jeremy = new Bidder("Jeremy", 65);
        // let jeremy try to buy the last two items
        Listing secondToLast = ecove.getListings().get(ecove.getListings().size() - 2);
        Listing last = ecove.getListings().get(ecove.getListings().size() - 1);
        // try second to last
        if (jeremy.bidOnListing(secondToLast, 60)) {
            System.out.println(jeremy.getName() + " got " + secondToLast.getTitle() + " for " + secondToLast.getLastBid().getAmount());
            System.out.println(jeremy.getName() + " has " + jeremy.getBudget() + " money left");
        } else {
            System.out.println(jeremy.getName() + " did not get " + secondToLast.getTitle());
        }
        // try last item
        if (jeremy.bidOnListing(last, 26)) {
            System.out.println(jeremy.getName() + " got " + last.getTitle() + " for " + last.getLastBid().getAmount());
            System.out.println(jeremy.getName() + " has " + jeremy.getBudget() + " money left");
        } else {
            System.out.println(jeremy.getName() + " did not get " + last.getTitle());
        }
        System.out.println(secondToLast.getTitle() + " is still available? : " + secondToLast.isAvailable());
        System.out.println(last.getTitle() + " is still available? : " + last.isAvailable());

        System.out.println("\nScenario 2:");
        Bidder mark = new Bidder("Mark", 111);
        Bidder susy = new Bidder("Susy", 113);
        // let susy outbid mark on the first item
        // will also reach number of max bids on that item
        Listing first = ecove.getListings().get(0);
        // mark going all-in
        if (mark.bidOnListing(first, mark.getBudget())) {
            System.out.println(mark.getName() + " is now the highest bidder.");
        }
        System.out.println("Still available? : " + first.isAvailable());
        // susy doing the same
        if (susy.bidOnListing(first, susy.getBudget())) {
            System.out.println(susy.getName() + " is now the highest bidder.");
        }
        System.out.println("Still available? : " + first.isAvailable());
    }
}
