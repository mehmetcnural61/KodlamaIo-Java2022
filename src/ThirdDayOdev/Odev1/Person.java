package ThirdDayOdev.Odev1;

public class Person extends Customer {
    public String NationalIdentity;
    public String FirstName;
    public String LastName;

    public String getNationalIdentity() {
        return NationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        NationalIdentity = nationalIdentity;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
