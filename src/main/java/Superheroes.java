

public class Superheroes {
    public static void main(String[] args) {


        Factory superhero1 = new Factory();
        superhero1.setName("Batman");
        superhero1.setStrong(8);
        superhero1.setLabel(Factory.Label.DC);

        System.out.println(superhero1 + " High intelligence, martial arts");


        Factory superhero2 = new Factory();
        superhero2.setName("Aquaman");
        superhero2.setStrong(5);
        superhero2.setLabel(Factory.Label.DC);

        System.out.println(superhero2 + " Breathing underwater, telepathy");


        Factory superhero3 = new Factory();
        superhero3.setName("Hulk");
        superhero3.setStrong(9);
        superhero3.setLabel(Factory.Label.MARVEL);

        System.out.println(superhero3 + " Overdeveloped musculature, superhuman stamina, ingenious intelligence,  superhuman strength, speed and toughness");


        Factory superhero4 = new Factory();
        superhero4.setName("Spiderman");
        superhero4.setStrong(7);
        superhero4.setLabel(Factory.Label.MARVEL);

        System.out.println(superhero4 + " Night vision, agility, accuracy, incredible willpower, sensory abilities, regeneration");


        Factory superhero5 = new Factory();
        superhero5.setName("Wolverine");
        superhero5.setStrong(10);
        superhero5.setLabel(Factory.Label.DC);

        System.out.println(superhero5 + " Martial arts, speed, regeneration");


        Factory superhero6 = new Factory();
        superhero6.setName("Superman");
        superhero6.setStrong(10);
        superhero6.setLabel(Factory.Label.DC);

        System.out.println(superhero6 + " X-ray and thermal vision, invulnerability");


    }
}
