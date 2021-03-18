package homework21;

public class Human {
    private int jumpHeight;
    private int runningLength;
    private String name;
    private boolean state;

    public Human(int jumpHeight, int runningLength, String name, boolean state) {
        this.jumpHeight = jumpHeight;
        this.runningLength = runningLength;
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunningLength() {
        return runningLength;
    }

    public boolean isState() {
        return state;
    }

    public static boolean State(boolean state){
        state = false;
        return state;
    }


    public static void Run(int dinst, int runningLength, String name, boolean state){
        if (runningLength >= dinst) {
            System.out.println("Человек " + name + " успешно пробежал дорожку в " + dinst + " метров");
        } else {
            System.out.println("Человек  " + name + " не пробежал дистанцию");
            state = false;
        }
    }

    public static void Jump (int height,int jumpHeight, String name, boolean state){
        if (jumpHeight >= height){
            System.out.println("Человек  " + name + "  перепргнул эту стену высотой " + height + " и идет дальше");
        } else {
            System.out.println("Человек  " + name + " не смог перепрыгнуть и застрял");
            State(state);
            state = false;
        }
    }
}
