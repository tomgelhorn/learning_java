public class Hamster extends Animal{
    private String favoriteFood;

    public Hamster(String name, int size, String favoriteFood) {
        this.name = name;
        this.size = size;
        this.favoriteFood = favoriteFood;
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
