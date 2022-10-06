package task2;

import task2.animal.Animal;
import task2.animal.Mamont;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ser_Deser_ialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal mam1 = new Mamont("Bober", 1, 3) ;
        Animal mam2 = new Mamont("Dyber", 2, 4) ;
        Animal mam3 = new Mamont("Kaster", 3, 4);
        Animal mam4 = new Mamont("Cyper", 4, 3);
        Animal mam5 = new Mamont("Mamont", 5, 4);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("1.save"));

        objectOutputStream.writeObject(mam1);
        objectOutputStream.writeObject(mam2);
        objectOutputStream.writeObject(mam3);
        objectOutputStream.writeObject(mam4);
        objectOutputStream.writeObject(mam5);
        objectOutputStream.close();

        // ==================================================================================================

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("1.save"));

        List<Animal> list = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            list.add((Animal) objectInputStream.readObject());
        }

        System.out.println(list);
    }
}
