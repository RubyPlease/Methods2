/**
 * Created by RobertBarber on 3/31/16.
 */
public class Animal {
    String animalName;
    String animalClass;
    int animalLimbs;
    boolean eatMeat;
    String animalRegion;
    boolean animalAsPet;
    boolean landAnimal;

    public Animal() {

    }

    public Animal(String animalClass, int animalLimbs, boolean eatMeat, String animalName, String animalRegion,
                  boolean animalAsPet, boolean landAnimal) {
        this.animalClass = this.animalClass;
        this.animalLimbs = animalLimbs;
        this.eatMeat = eatMeat;
        this.animalName = animalName;
        this.animalRegion = animalRegion;
        this.animalAsPet = animalAsPet;
        this.landAnimal = landAnimal;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public int getAnimalLimbs() {
        return animalLimbs;
    }

    public void setAnimalLimbs(int animalLimbs) {
        this.animalLimbs = animalLimbs;
    }

    public boolean isEatMeat() {
        return eatMeat;
    }

    public void setEatMeat(boolean eatMeat) {
        this.eatMeat = eatMeat;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {

        //Need to ensure field is not left blank
        if (animalName.isEmpty()){
            System.out.println("Error. Please enter animal name");
        }
        else {
            this.animalName = animalName;
        }
    }

    public String getAnimalRegion() {
        return animalRegion;
    }

    public void setAnimalRegion(String animalRegion) {
        this.animalRegion = animalRegion;
    }

    public boolean isAnimalAsPet() {
        return animalAsPet;
    }

    public void setAnimalAsPet(boolean animalAsPet) {
        this.animalAsPet = animalAsPet;
    }

    public boolean isLandAnimal() {
        return landAnimal;
    }

    public void setLandAnimal(boolean landAnimal) {
        this.landAnimal = landAnimal;
    }

}
