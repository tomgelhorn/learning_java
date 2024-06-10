public abstract class Listing {
    private String title;
    private String description;

    public Listing(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public abstract int getCurrentPrice();
    public abstract boolean isAvailable();
    public abstract boolean receiveBid(Bid bid);

    public abstract Bid getLastBid();
}
