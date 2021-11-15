import Superheroes.*;

import java.util.Random;

/**
 *
 */

public class RandomSuperheroesGenerator {

    final Random random = new Random();

    public Superhero next() {
        switch (random.nextInt(6)) {
            default:
            case 0:
                return new AquaMan();
            case 1:
                return new BatMan();
            case 2:
                return new Hulk();
            case 3:
                return new SpiderMan();
            case 4:
                return new SuperMan();
            case 5:
                return new Wolverine();

        }
    }

}

class Superheroes {
    final static RandomSuperheroesGenerator gen = new RandomSuperheroesGenerator();

    public static void main(String[] args) {
        Superhero[] superheroes = new Superhero[6];
        int i;
        for (i = 0; i < superheroes.length; i++)
            superheroes[i] = gen.next();


    }


}

//    Factory factory = new Factory();
//    BatMan batMan = factory.createBatMan();
//    SpiderMan spiderMan = factory.createSpiderMan();
//    AquaMan aquaMan = factory.createAquaMan();
//    Hulk hulk = factory.createHulk();
//    SuperMan superMan = factory.createSuperMan();
//    Wolverine wolverine = factory.createWolverine();

