package Encapsulation.FootballTeamGenerator;

public class Stats {
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Stats(int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setEndurance(int endurance) {
        correct(endurance);
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        correct(sprint);
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        correct(dribble);
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        correct(passing);
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        correct(shooting);
        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        return (this.endurance + this.dribble + this.passing + this.shooting + this.sprint) / 5.0;
    }

    private void correct(int stat) {
        if (stat < 0 || stat > 100) {
            throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", stat));
        }
    }
}
