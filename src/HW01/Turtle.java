package HW01;

public class Turtle extends Animal{

    public Turtle(String name, int abilityToPassObstacles) {
        super(name, abilityToPassObstacles);
    }

    public int getAbilityToPassObstacles() {
        return abilityToPassObstacles;
    }
    public void setAbilityToPassObstacles(int abilityToPassObstacles) {
        this.abilityToPassObstacles = abilityToPassObstacles;
    }
}
