public class Main {
    public static void main(String[] args) {
        Ecove ecove = new Ecove();
        ecove.addListing(new Auction("Corsehr SF750", "Good luck finding another one", 2));
        ecove.addListing(new BuyItNow("Gigabit B550I", "Used condition, missing chipset cooler", 115));
        ecove.addListing(new Auction("AND Rizen 5600X", "Perfect condition, the bent pins are not used anyway", 8));
        ecove.addListing(new Auction("AND Rizen 5800X", "Package will only contain depicted items", 6));
        ecove.addListing(new Auction("Levono Laptop", "Defective, parts-only", 13));
        ecove.addListing(new Auction("Samsnug C34H890WJU LCD", "Besides major panel damage in perfect condition", 12));
        ecove.addListing(new BuyItNow("SUS 1080Ti Strix", "Dustier than the back of your washing machine", 200));
        ecove.addListing(new BuyItNow("Sunny PSP-2004", "Don't have a battery so can't check if it works, just trust me", 45));
        ecove.addListing(new BuyItNow("NV156FHM-N4K 15,6\" IPS LCD", "New, tested beforehand", 59));
        ecove.addListing(new BuyItNow("NV156FHM-N4K LCD mini HDMI EDP", "Only 120Hz not 144Hz", 25));
        System.out.println(ecove);

        Bidder jeremy = new LCDGuy("Jeremy", 100);
        jeremy.shop(ecove);

        Bidder paul = new Perfectionist("Paul", 200);
        paul.shop(ecove);

        System.out.println(ecove);

        Bidder freddy = new BulkBuyer("Freddy", 2000);
        Bidder eddy = new BulkBuyer("Eddy", 2000);
        freddy.shop(ecove);
        eddy.shop(ecove);
        System.out.println(ecove);
    }
}