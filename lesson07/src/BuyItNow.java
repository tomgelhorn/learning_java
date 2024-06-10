public class BuyItNow extends Listing {
    private int price;
    private Bid buyingBid;

    public BuyItNow(String title, String description, int price) {
        super(title, description);
        this.price = price;
        this.buyingBid = null;
    }

    @Override
    public int getCurrentPrice() {
        return price;
    }

    @Override
    public boolean isAvailable() {
        return buyingBid == null;
    }

    @Override
    public boolean receiveBid(Bid bid) {
        if (!isAvailable() || bid.getAmount() < price) {
            return false;
        }
        buyingBid = bid;
        return true;
    }

    @Override
    public Bid getLastBid() {
        return buyingBid;
    }
}
