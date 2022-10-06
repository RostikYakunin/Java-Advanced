package task4.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Numbers {
    private int number;


    public Numbers() {
    }

    public Numbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @XmlAttribute (name = "number")
    public void setNumber(int number) {
        this.number = number;
    }


}
