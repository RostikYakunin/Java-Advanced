package task2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainForOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("text.txt");
        out.write(("В Java потоки ввода-вывода InputStream и OutputStream \nпредставляют " +
                "собой концепцию работы с внешним миром, \nбудь то файл на диске, экран монитора, " +
                "сетевое подключение или принтер." +
                " \nТо есть всего, что выходит за пределы приложения.").getBytes(StandardCharsets.UTF_8));

        out.close();

    }
}
