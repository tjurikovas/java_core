package HW01;

public class Cat extends Animal {

    public Cat(String name, int abilityToPassObstacles) {
        super(name, abilityToPassObstacles);
    }

    public int getAbilityToPassObstacles() {
        return abilityToPassObstacles;
    }
    public void setAbilityToPassObstacles(int abilityToPassObstacles) {
        this.abilityToPassObstacles = abilityToPassObstacles;
    }
}
