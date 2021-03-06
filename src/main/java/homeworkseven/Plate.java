package homeworkseven;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void eatFromPlate(int app){
        food -= app;
    }

    public void info(){
        System.out.println("Plate " + food);
    }

    public int getFood() {
        return food;
    }
    public int addFood(Plate plate){
        return food += 20;
    }
}
