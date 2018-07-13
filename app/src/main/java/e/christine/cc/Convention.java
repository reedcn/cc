package e.christine.cc;

/**
 * Created by Christine on 7/1/2018.
 */

public class Convention {

    String conventionName;
    String conventionCity;
    String conventionState;

    public Convention(String id, String conventionName, String conventionCity, String conventionState) {
        this.conventionName = conventionName;
        this.conventionCity = conventionCity;
        this.conventionState = conventionState;
    }

    public String getConventionName() {
        return conventionName;
    }

    public String getConventionCity() {
        return conventionCity;
    }

    public String getConventionState() {
        return conventionState;
    }
}
