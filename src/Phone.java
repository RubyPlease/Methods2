/**
 * Created by RobertBarber on 3/31/16.
 */
public class Phone {
    String phoneName;
    String phoneBrand;
    boolean isSmart;
    int phoneWeightOz;
    int phoneCost$;

    public Phone() {

    }

    public Phone(String phoneName, String phoneBrand, boolean isSmart,
                 int phoneWeightOz, int phoneCost$){
        this.phoneName = phoneName;
        this.phoneBrand = phoneBrand;
        this.isSmart = isSmart;
        this.phoneWeightOz = phoneWeightOz;
        this.phoneCost$ = phoneCost$;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {

        // i feel like these aren't very diverse, but I'm not sure what other ones I can use
        if (phoneName.isEmpty()) {
            System.out.println("Error. Please Enter Phone name");
        }
        else {
            this.phoneName = phoneName;
        }
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {

        isSmart = smart;
    }

    public int getPhoneWeightOz() {
        return phoneWeightOz;
    }

    public void setPhoneWeightOz(int phoneWeightOz) {
        this.phoneWeightOz = phoneWeightOz;
    }

    public int getPhoneCost$() {
        return phoneCost$;
    }

    public void setPhoneCost$(int phoneCost$) {
        this.phoneCost$ = phoneCost$;
    }

}
