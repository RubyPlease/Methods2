public class Main {

//I can't get the program to not return the input if it does not meet the setter requirements

    public static void main(String[] args) {
        Band myBand1;
        myBand1 = new Band();
        myBand1.setBandName("bandos");
        myBand1.setYearFormed(1973);
        myBand1.setActive(true);
        myBand1.setAlbums(13);
        myBand1.setMembers(6);
        myBand1.setStyle("metal");
        myBand1.setCountry("Hondurus");

        System.out.println(myBand1.members);

        Phone mePhone;
        mePhone = new Phone();
        mePhone.setPhoneName("iPhone");
        mePhone.setPhoneBrand("Apple");
        mePhone.setSmart(true);
        mePhone.setPhoneCost$(500);
        mePhone.setPhoneWeightOz(10);

        City newCity;
        newCity = new City();
        newCity.setCityName("Nashville");
        newCity.setMayorName("Garth");
        newCity.setPopulation(800000);
        newCity.setMayorSalary(1000000);
        newCity.setCanAffordSalary(true);

        Team myTeam;
        myTeam = new Team();
        myTeam.setTeamName("Reds");
        myTeam.setTeamCity("Cincinnati");
        myTeam.setLastYearAllStars(2);
        myTeam.setLastYearWins(64);
        myTeam.setLastYearPlayoffs(false);

        Animal myAnimal;
        myAnimal = new Animal();
        myAnimal.setAnimalName("rattlesnake");
        myAnimal.setAnimalLimbs(0);
        myAnimal.setAnimalRegion("North America");
        myAnimal.setAnimalAsPet(false);
        myAnimal.setAnimalClass("Reptilia");
        myAnimal.setEatMeat(true);
        myAnimal.setLandAnimal(true);

    }

}
