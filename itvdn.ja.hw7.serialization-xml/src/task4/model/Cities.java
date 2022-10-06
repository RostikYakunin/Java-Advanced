package task4.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cities")
public class Cities {

    @XmlElement(name = "city")
    private List<City> cities;

    public Cities() {
    }

    public void add(City city) {
        cities.add(city);
    }

    public Cities(List<City> cities) {
        this.cities = cities;
    }


    public void setAlbums(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "albums=" + cities +
                '}';
    }
}
