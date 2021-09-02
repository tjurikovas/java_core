package HW01;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 5);
        Donkey donkey = new Donkey("Кики", 8);
        Turtle turtle = new Turtle("Капуша", 30);
        Wolf wolf = new Wolf("Серый", 11);

        Object[] teamСom = new Object[4];
        teamСom[0] = cat;
        teamСom[1] = donkey;
        teamСom[2] = turtle;
        teamСom[3] = wolf;

        Team team = new Team("Орлы", teamСom);
        team.infoTeam();




    }
}