package Polymorphism.Lab;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.setName(name);
        this.setFavouriteFood(favouriteFood);
    }

    private void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    private void setFavouriteFood(String faforiteFood) {
        this.favouriteFood = faforiteFood;
    }

    protected String getFavouriteFood() {
        return favouriteFood;
    }

    protected  String explainSelf() {
        return String.format("I am %s and my fovourite food is %s", this.getName(), getFavouriteFood());
    }
}
