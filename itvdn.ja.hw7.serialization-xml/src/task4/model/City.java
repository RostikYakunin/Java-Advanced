package task4.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "city")
public class City {
    private String nameOfCity;
    private Numbers number;
    private Street street;
    private Size size;

    public City(String nameOfCity, Street street, Size size, Numbers number) {
        this.nameOfCity = nameOfCity;
        this.street = street;
        this.size = size;
        this.number = number;
    }

    public City() {
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    @XmlElement(name = "name")
    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public Street getPrice() {
        return street;
    }

    @XmlElement(name = "street")
    public void setPrice(Street street) {
        this.street = street;
    }

    public Size getType() {
        return size;
    }

    @XmlAttribute()
    public void setType(Size size) {
        this.size = size;
    }

    public Numbers getNumber() {
        return number;
    }
    @XmlElement (name = "number")
    public void setNumber(Numbers number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Album{" +
                "singer='" +
                ", nameOfCity='" + nameOfCity + '\'' +
                ", price=" + street +
                ", type=" + size +
                '}';
    }

}
