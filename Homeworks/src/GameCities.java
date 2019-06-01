import com.sun.deploy.util.ArrayUtil;
import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

import java.util.Scanner;

public class GameCities {
    public static void main(String[] args) {
        String cities = "Сумы Мелитополь Николаев Алупка Львов Ровно Киев Полтава Зиньков Богодухов";
        String[] game = (cities.split(" "));
        System.out.println("Давай поиграем в ‘Города’. Ты первый!");
        Scanner city = new Scanner(System.in);
        String answer = null;
        while (true) {
            System.out.println("Называй город: ");
            String customCity = city.nextLine();
            char lastChar = customCity.charAt(customCity.length() - 1);
            String last = Character.toString(lastChar);

            //loop
            for (int u = 0; u < game.length; u++) {
                answer = null;
                if (game[u] != null) {
                    char firstChar = game[u].charAt(0);
                    String first = Character.toString(firstChar);
                    if (last.equalsIgnoreCase(first)) {
                        answer = game[u];
                        game[u] = null;
                        System.out.println(answer);
                        break;
                    }
                }
            }
            if (answer == null) {
                System.out.println("Я проиграл, ты знаешь больше городов");
                break;
            }
        }

    }
}




