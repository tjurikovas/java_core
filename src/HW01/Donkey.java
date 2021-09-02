package HW01;

public class Donkey extends Animal{
    public Donkey(String name, int abilityToPassObstacles) {
        super(name, abilityToPassObstacles);
    }

    public int getAbilityToPassObstacles() {
        return abilityToPassObstacles;
    }
    public void setAbilityToPassObstacles(int abilityToPassObstacles) {
        this.abilityToPassObstacles = abilityToPassObstacles;
    }
}
