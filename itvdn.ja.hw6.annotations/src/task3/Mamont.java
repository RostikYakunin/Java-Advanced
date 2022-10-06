package task3;

@Deprecated
public class Mamont extends Animal{

    private int paw;

    @Deprecated
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
        return "Cat{" +
                "paw=" + paw +
                '}';
    }
}
