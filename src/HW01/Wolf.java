package HW01;

public class Wolf extends Animal{

    public Wolf(String name, int abilityToPassObstacles) {
        super(name, abilityToPassObstacles);
    }

    public int getAbilityToPassObstacles() {
        return abilityToPassObstacles;
    }
    public void setAbilityToPassObstacles(int abilityToPassObstacles) {
        this.abilityToPassObstacles = abilityToPassObstacles;
    }

}
