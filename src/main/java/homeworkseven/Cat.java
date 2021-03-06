package homeworkseven;

public class Cat {
    boolean satiety;
    String name;
    int appetit;

    public Cat(boolean satiety, String name, int appetit) {
        this.satiety = satiety;
        this.name = name;
        this.appetit = appetit;
    }
    public void catInfo(){
        System.out.println(name + " имеет сытость в состоянии " + satiety);
    }

    public void eat (Plate plate){
        if (appetit <= plate.getFood()){
            plate.eatFromPlate(appetit);
            satiety = true;
            System.out.println(name + " поел из своей тарелки имея аппетит в значении " + appetit);
        } else {
            System.out.println("Нужно больше еды. " + name + " голодный");
        }
    }
}
