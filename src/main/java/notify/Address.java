package notify;

public class Address {

    private String name = "";
    private String streetAddress = "";
    private String town = "";
    private String county = "";
    private String postcode = "";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return this.county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String toString() {
        return String.format(
            (
                "name: %s\n" +
                "streetAddress: %s\n" +
                "town: %s\n" +
                "county: %s\n" +
                "postcode: %s\n"
            ),
            this.name, this.streetAddress, this.town, this.county, this.postcode
        );
    }

}
