package HW01;

import java.util.Arrays;

public class Team {
    private String teamName;
    private Object[] team;

    public Team(String teamName, Object[] team) {
        this.teamName = teamName;
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Object[] getTeam() {
        return team;
    }
    public void setTeam(String[] team) {
        this.team = team;
    }


//    public double infoPastObstacles() {
//        System.out.println();
//    return }

    public void infoTeam (){
        System.out.println("Сегодня выступает команда " + teamName + ". \nУчастники команды: ");
        for(int i = 0; i < team.length; i ++) {
//        System.out.println(team[i].name);   СДЕСЬ ПРОБЛЕМА
        }

    }
//        int y = 0;
//        Cat cat = (Cat) team[0];
//        Donkey donkey = (Donkey) team[1];
//        Turtle turtle = (Turtle) team[2];
//        Wolf wolf = (Wolf) team[3];
//        for(int i = 0; i >= team.length; i++ )
//            System.out.print("Участник №: " + y + team[i]);
//            y++;
//        }
}


