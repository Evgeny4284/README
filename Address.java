import java.util.Objects;

public class Address {

    private final String country;
    private final String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Address other = (Address) obj;
        return country.equals(other.country) && city.equals(other.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }
}
