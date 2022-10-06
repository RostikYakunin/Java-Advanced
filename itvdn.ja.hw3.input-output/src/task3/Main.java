package task3;

public class Main {
    /*
    Необходимо создать строку с текстом (текст взять любой из интернета).
    Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.
    */
    public static void main(String[] args) {
        String str = "Так уж получилось, что Java как язык предоставляет много возможностей " +
                "по работе с вводом-выводом.";
        System.out.println("Начальная строка = " + str);
        System.out.println("Первая половина строки = " + str.substring(0, str.length() / 2));
        System.out.println("Вторая половина строки = " + str.substring(str.length() / 2));

    }
}
