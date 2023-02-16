import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game1 {

        //Компьютер поздоровался и рассказал правила игры
        //Комп загадал число от 0 до 10
        //Чел пытается угадать число с трех попыток
        //Если угажывает0 - то пишем: молодец
        //Если нет - то пишем неудачник

        public static void main(String[] args) {
            System.out.println(" Привет, угадай число от 0 до 10 ");

            int compnumber = ThreadLocalRandom.current().nextInt(0,10); // Этот оператор выдает рандомное число.ThreadLocalRandom.current().nextInt(0,10)
            System.out.println(" Я загадал " + compnumber);

            Scanner scanner = new Scanner(System.in);

            int count = 0;
            boolean isGuessed = false;
            while (count<3 && ! isGuessed) {
                count++;
                System.out.println("Попытка № "+ count);

                int myNumber = scanner.nextInt();

                if (myNumber == compnumber) {
                    isGuessed = true;
                    System.out.println("Угадал");

                } else {
                    System.out.println("Попробуй еще раз");

                }

            }




        }

}

