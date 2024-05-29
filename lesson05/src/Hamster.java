public class Hamster {
    private String name;
    private int size;
    private String favoriteFood;

    public Hamster(String name, int size, String favoriteFood) {
        this.name = name;
        this.size = size;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void eatFood(String food) {
        if (favoriteFood.equals(food)) {
            System.out.println("Yum. Eating "+ food);
        }
        else{
            System.out.println("Eating "+ food);
        }
    }

}
