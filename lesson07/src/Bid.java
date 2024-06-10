public class Bid {
    private int amount;
    private Bidder owner;

    public Bid(int amount, Bidder owner) {
        this.amount = amount;
        this.owner = owner;
    }

    public int getAmount() {
        return amount;
    }

    public Bidder getOwner() {
        return owner;
    }
}
