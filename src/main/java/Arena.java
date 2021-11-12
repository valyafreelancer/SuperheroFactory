import java.util.Scanner;
import java.util.Set;
import static com.sun.org.apache.xml.internal.dtm.Axis.getNames;

/**
 *
 */

public class Arena {
    public static final Set<String> superheroes = Set.of("Бэтмен", "Супермен", "Аквамен", "Халк", "Человек-паук", "Рассамаха");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Имя супергероя вводить на русском языке с заглавной буквы
         */
        System.out.println("Введите имя первого супергероя");
        String hero1 = input.next();

        if (!superheroes.contains(hero1)) {
            throw new IllegalArgumentException("Неверно введено имя супергероя " + hero1);
        }

        System.out.println("Введите имя второго супергероя");
        String superhero2 = input.next();


        if (!superheroes.contains(superhero2)) {
            throw new IllegalArgumentException("Неверно введено имя супергероя" + superhero2);
        }


    }

}

