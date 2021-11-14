

public class Factory {

    public BatMan createBatMan() {
        BatMan batMan = new BatMan();
        batMan.setName("Брюс Уэйн");
        batMan.setLabel(Label.DC);
        batMan.setSuperpower(" Боевые искусства");

        return batMan;
    }

    public SpiderMan createSpiderMan() {
        SpiderMan spiderMan = new SpiderMan();
        spiderMan.setName("Питер Паркер");
        spiderMan.setLabel(Label.MARVEL);
        spiderMan.setSuperpower("Ночное видение, ловкость, регенерация");

        return spiderMan;
    }




}

