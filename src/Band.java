/**
 * Created by RobertBarber on 3/28/16.
 */
public class Band {
    String bandName;
    int yearFormed;
    boolean active;
    String country;
    int albums;
    int members;
    String style;

    public Band() {

    }

    public Band(String bandName, int yearFormed, boolean active, String country,
                int albums, int members, String style) {

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getYearFormed() {
        return yearFormed;
    }

    public void setYearFormed(int yearFormed) {
        this.yearFormed = yearFormed;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAlbums() {
        return albums;
    }

    public void setAlbums(int albums) {
        this.albums = albums;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {

        //i need to make a constraint enforcing that a positive number be entered
        if (members >= 1){
            this.members = members;
        }
        else {
            System.out.println("Error. Field requires positive integer");
        }
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

}

