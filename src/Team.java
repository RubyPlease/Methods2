/**
 * Created by RobertBarber on 3/31/16.
 */
public class Team {
    String teamName;
    String teamCity;
    int lastYearWins;
    int lastYearAllStars;
    boolean lastYearPlayoffs;

    public Team() {

    }

    public Team(String teamName, String teamCity, int lastYearWins,
                int lastYearAllStars, boolean lastYearPlayoffs) {

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public int getLastYearWins() {
        return lastYearWins;
    }

    public void setLastYearWins(int lastYearWins) {

        if (lastYearWins < 0) {
            System.out.println("Error. Please enter positive integer");
        } else if (lastYearWins > 162) {
            System.out.println("Error. Please input win total");
        } else {
            this.lastYearWins = lastYearWins;
        }
    }

    public int getLastYearAllStars() {
        return lastYearAllStars;
    }

    public void setLastYearAllStars(int lastYearAllStars) {
        this.lastYearAllStars = lastYearAllStars;
    }

    public boolean isLastYearPlayoffs() {
        return lastYearPlayoffs;
    }

    public void setLastYearPlayoffs(boolean lastYearPlayoffs) {
        this.lastYearPlayoffs = lastYearPlayoffs;
    }

}
