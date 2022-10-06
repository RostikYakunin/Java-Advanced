package hometask3;

public class Car implements Comparable <Car> {
    String model;
    String color;
    int speed;
    int price;

    public Car(String model, String color, int speed, int price) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    // Дописать логику, чтобы метод compareTo()
    // осуществил поиск по скорости(если же скорость у 2-х объектов равна, то ищем по цене)
    // -> цене - > моделе -> цвету машины.

    public int compareTo(Car o) {
        int temp = Integer.compare(this.speed, o.speed); // сортировка по скорости
        int temp1 = Integer.compare(this.price,o.price); // сортировка по цене
        int temp2 = this.model.compareTo(o.model);       // сортровка по модели
        int temp3 = this.color.compareTo(o.color);       // сортировка по цвету

        if (temp==0) temp = temp1;
        if (temp1 == 0) temp = temp2;
        if (temp2==0) temp = temp3;
        return temp;

    }
}