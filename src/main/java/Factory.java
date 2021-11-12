import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Factory {

    enum Label {MARVEL, DC}

    private String name;
    private int Strong;
    private Label label;

    public static void getNames() {

        Factory superhero1 = new Factory();
        superhero1.setName("Бэтмен");
        superhero1.setStrong(8);
        superhero1.setLabel(Factory.Label.DC);

        System.out.println(superhero1 + " Высокий интеллект, ,боеыве искусства");


        Factory superhero2 = new Factory();
        superhero2.setName("Аквамен");
        superhero2.setStrong(5);
        superhero2.setLabel(Factory.Label.DC);

        System.out.println(superhero2 + " Дыхание под водой, телепатия");


        Factory superhero3 = new Factory();
        superhero3.setName("Халк");
        superhero3.setStrong(9);
        superhero3.setLabel(Factory.Label.MARVEL);

        System.out.println(superhero3 + " Чрезмерно развитая мускулатура, сверхчеловеческая выносливость, гениальный интеллект, сверхчеловеческая сила, скорость и стойкость");


        Factory superhero4 = new Factory();
        superhero4.setName("Человек-паук");
        superhero4.setStrong(7);
        superhero4.setLabel(Factory.Label.MARVEL);

        System.out.println(superhero4 + " Ночное видение, ловкость, точность, невероятная сила воли, сенсорные способности, регенерация");


        Factory superhero5 = new Factory();
        superhero5.setName("Рассамаха");
        superhero5.setStrong(10);
        superhero5.setLabel(Factory.Label.DC);

        System.out.println(superhero5 + " Боевые искусства, скорость, регенерация");


        Factory superhero6 = new Factory();
        superhero6.setName("Супермен");
        superhero6.setStrong(10);
        superhero6.setLabel(Factory.Label.DC);

        System.out.println(superhero6 + " Рентгеновское зрение,сверхскорость, неуязвимость");


    }
}

