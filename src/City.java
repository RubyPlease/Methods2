/**
 * Created by RobertBarber on 3/29/16.
 *
 * a city is a place where people live
 * cities need a mayorName
 * cities need a population
 * mayorName has a salary
 * a city cannot afford a mayorName if population is <1000
 * maximum salary of mayorName is $1000000
 * minimum salary of mayorName is $10000
 * mayorName's salary is equal to population * 10
 * population cannot pay more than $10 per com.company.person for mayorName's salary
 */
public class City {
    String cityName;
    String mayorName;
    int population;
    int mayorSalary;
    boolean mayorSalaryMax;
    boolean mayorSalaryMin;
    boolean canAffordSalary;

    public City() {

    }

    public City(String cityName, String mayorName, int population, int mayorSalary,
                boolean mayorSalaryMax, boolean mayorSalaryMin, boolean canAffordSalary){
        this.cityName = cityName;
        this.mayorName = mayorName;
        this.population = population;
        this.mayorSalary = mayorSalary;
        this.mayorSalaryMax = mayorSalaryMax;
        this.mayorSalaryMin = mayorSalaryMin;
        this.canAffordSalary = canAffordSalary;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getMayorName() {
        return mayorName;
    }

    public void setMayorName(String mayorName) {
        this.mayorName = mayorName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {

        //i need to make sure the number entered is positive
        if (population >= 0) {
            this.population = population;
        }
        else {
            System.out.println("Error. Please enter positive integer.");
        }
    }

    public int getMayorSalary() {
        return mayorSalary;
    }

    public void setMayorSalary(int mayorSalary) {
        this.mayorSalary = mayorSalary;
    }

    public boolean isMayorSalaryMax() {
        return mayorSalaryMax;
    }

    public void setMayorSalaryMax(boolean mayorSalaryMax) {
        this.mayorSalaryMax = mayorSalaryMax;
    }

    public boolean isMayorSalaryMin() {
        return mayorSalaryMin;
    }

    public void setMayorSalaryMin(boolean mayorSalaryMin) {
        this.mayorSalaryMin = mayorSalaryMin;
    }

    public boolean isCanAffordSalary() {
        return canAffordSalary;
    }

    public void setCanAffordSalary(boolean canAffordSalary) {
        this.canAffordSalary = canAffordSalary;
    }

    /* this constructor will create a city. I need to know the population */
    /* private City(int pop, int maySal){
        population = pop;
        // I am going to set the salary of the mayorName equal to the population * 10 //
        mayorSalary = pop * 10;
        /* I also need to set the minimum and maximum limits on
        the salary of the mayorName, at $10000 and $1000000 respectively.
        If the population is < 1000, then the mayorSalary will be $10000.
        If the population is > 100000, then the mayorSalary will be $1000000. */
        //mayorSalary = maySal;

        //I need to determine if the city has the population to afford the salary of the mayorName//
        /*If the city has a population less than the minimum required
        to pay the mayorName's salary, then the city is not viable */
    //}

}
