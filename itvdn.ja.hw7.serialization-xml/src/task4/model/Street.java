package task4.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Street {
    private String nameOfStreet;

    public Street(String nameOfStreet) {
        this.nameOfStreet = nameOfStreet;
    }

    public Street() {
    }

    public String getNameOfStreet() {
        return nameOfStreet;
    }

    @XmlAttribute(name = "street")
    public void setNameOfStreet(String nameOfStreet) {
        this.nameOfStreet = nameOfStreet;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + nameOfStreet +
                '}';
    }
}
