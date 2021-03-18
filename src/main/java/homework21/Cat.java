package homework21;

public class Cat {
    private int jumpHeight;
    private int runningLength;

    public Cat(int jumpHeight, int runningLength) {
        this.jumpHeight = jumpHeight;
        this.runningLength = runningLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getRunningLength() {
        return runningLength;
    }

    public void setRunningLength(int runningLength) {
        this.runningLength = runningLength;
    }

    public static void Run(int dinst, int runningLength){
        if (runningLength >= dinst) {
            System.out.println("Кот пробежал успешно пробежал дорожку в " + dinst + " метров");
        } else {
            System.out.println("Кот не пробежал дистанцию");
        }
    }

    public static void Jump (int height,int jumpHeight){
        if (jumpHeight >= height){
            System.out.println("Кот перепргнул эту стену высотой" + height + " и идет дальше");
        } else {
            System.out.println("Кот не смог перепрыгнуть и застрял");
        }

    }
}
