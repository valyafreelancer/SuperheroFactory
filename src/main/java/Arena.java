import java.util.Set;


/**
 *
 */

public class Arena {
    public static final Set<String> superheroes = Set.of(
            "Бэтмен",
            "Супермен",
            "Аквамен",
            "Халк",
            "Человек-паук",
            "Рассамаха");

    public static void main (String[] args) {
        Factory factory = new Factory();
        BatMan batMan = factory.createBatMan();

    }
}