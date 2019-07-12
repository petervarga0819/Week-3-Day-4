package Animal;

public class Animal<Hunger, Thirst> {

    private int hunger;
    private int thirst;

    public Animal() {
        hunger = 50;
        thirst = 50;
    }

    public void eat(){
        this.hunger--;
    }
    public void drink(){
        this.thirst--;
    }
    public void play(){
        this.hunger++;
        this.thirst++;
    }

}



