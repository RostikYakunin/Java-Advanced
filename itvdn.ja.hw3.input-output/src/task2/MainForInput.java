package task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class MainForInput {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(new FileInputStream("text.txt"), StandardCharsets.UTF_8);

        int i;
        while ((i = input.read()) !=-1) {
            System.out.print((char) i);
        }

        input.close();
    }
}
