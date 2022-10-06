package task2.animal;

import java.io.Serializable;

public class Mamont extends Animal implements Serializable {

    private int paw;


    public Mamont(String name, int id, int paw) {
        super(name, id);
        this.paw = paw;
    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }

    @Override
    public String toString() {
        return "\nMamont{ id = " + super.getId() +
                ", name = " + super.getName() +
                ", paw=" + paw +
                '}';
    }
}
