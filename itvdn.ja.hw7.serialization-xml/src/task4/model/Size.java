package task4.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement()
public class Size {
    private String name;

    public Size(String name) {
        this.name = name;
    }

    public Size() {
    }

    public String getName() {
        return name;
    }

    @XmlValue()
    public void setName(String name) {
        this.name = name;
    }
}
