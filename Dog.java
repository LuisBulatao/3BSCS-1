public class Dog implements Pet {
    private String breed;

    public String getBreed() {
    return breed;
}

    public void setBreed(String breed) {
        this.breed = this.breed;

    }

    @Override
    public String makeSound() {
        return "Aw, aw!";
    }

    @Override
    public String play() {
        return "Catching objects that you throw!";
    }

}
