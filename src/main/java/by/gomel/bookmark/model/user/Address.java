package by.gomel.bookmark.model.user;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import by.gomel.bookmark.model.BaseObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Address extends BaseObject implements Serializable {
	
	private static final long serialVersionUID = -8029419715974368478L;
	
	private String street;
    private String city;
    private String country;
    private String state;
    private String zip;
    
	@Column(name="street", length = 50)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    @Column(name="city", length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    @Column(name="country", length = 50)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name="state", length = 2)
    public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name="zip", length = 10)
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
    /**
     * Overridden equals method for object comparison. Compares based on hashCode.
     *
     * @param o Object to compare
     * @return true/false based on hashCode
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }

        final Address address1 = (Address) o;

        return this.hashCode() == address1.hashCode();
    }

    public int hashCode() {
        int result;
        result = (street != null ? street.hashCode() : 0);
        result = 29 * result + (city != null ? city.hashCode() : 0);
        result = 29 * result + (country != null ? country.hashCode() : 0);
        result = 29 * result + (state != null ? state.hashCode() : 0);
        result = 29 * result + (zip != null ? zip.hashCode() : 0);
        return result;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("country", this.country)
                .append("street", this.street)
                .append("city", this.city)
                .append("state", this.state)
                .append("zip", this.zip).toString();
    }
}
