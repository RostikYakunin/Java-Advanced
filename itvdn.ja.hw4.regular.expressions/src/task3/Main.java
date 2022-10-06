package task3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    /*
    Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
    С помощью этого методы выведите в консоль,
    сколько времени прошло с вашего дня рождения в удобном для восприятия виде,
    например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».
    */
    public static void main(String[] args) {
        //задаю дату рождения
        Calendar dayOfBirth = new GregorianCalendar();
        int year = 1994;
        int month = 9;
        int day = 13;
        dayOfBirth.set(year,month,day);
        System.out.println("Дата рождения: " + dayOfBirth.getTime());

        //задаю действующую дату
        Calendar calendar1 = new GregorianCalendar();
        System.out.println("Действующая дата: " + calendar1.getTime());

        //высчитываю разницу в милисекундах между ДР и действующей датой
        double time = calendar1.getTimeInMillis() - dayOfBirth.getTimeInMillis();

        //перевожу время в года
        float timeInYears = (float) (time/1000/60/60/24/365);

        //и в месяца
        int month1 = (int) ((timeInYears - (int)(timeInYears))*10) +1;

        // вывод результата
        System.out.println("Вам исполнилось: " + (int)timeInYears + " лет, " + month1 + " месяцев");

    }
}
