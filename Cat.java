public class Cat implements Pet {

    private int noLives;

    public int getNoLives(){
        return noLives;
    }

    public void setNoLives(int noLives){
        this.noLives = noLives;
    }

    @Override
    public String makeSound(){
        return"Meoew,meow!";
    }

    @Override
    public String play() {
        return "Catching moving objects";
    }
}
