package Encapsulation.FootballTeamGenerator;

public class Player {
    private String name;
    private Stats stats;

    public Player(String name, Stats stats) {
        this.setName(name);
        this.setStats(stats);
    }

    private void setName(String name) {
        if (name.isEmpty() || name.equals(" ") || name == null){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setStats(Stats stats) {
        this.stats = stats;
    }
}
