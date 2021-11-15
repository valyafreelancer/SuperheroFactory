import java.util.Set;


/**
 *
 */

public class Arena {
    public static final Set<String> superheroes = Set.of(
            "Бэтмен",
            "Человек-паук",
            "Аквамен",
            "Халк",
            "Супермен",
            "Рассамаха");

    public static void main (String[] args) {
        Factory factory = new Factory();
        BatMan batMan = factory.createBatMan();
        SpiderMan spiderMan = factory.createSpiderMan();
        AquaMan aquaMan = factory.createAquaMan();
        Hulk hulk = factory.createHulk();
        SuperMan superMan = factory.createSuperMan();
        Wolverine wolverine = factory.createWolverine();

    }

}