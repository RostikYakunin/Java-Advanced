package task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /*
    Создайте в package текстовый файл и клас, внесите в файл некий текст.
    Выведите на экран содержимое файла.
    */
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("fileForTask4.txt");
        String str = "Создайте в package текстовый файл и клас, внесите в файл некий текст.\n" +
                     "Выведите на экран содержимое файла.";
        fw.write(str);
        fw.close();

        FileReader fr = new FileReader("fileForTask4.txt");
        Scanner out = new Scanner(fr);

        int i = 1;
        while (out.hasNext()) {
            System.out.println(i + ":" + out.nextLine());
            i++;
        }
        out.close();
    }
}
