package homework21;

public class Main {
    public static void main (String [] args){
        Human human1 = new Human(25, 70, "Павел", true);
        Cat cat1 = new Cat(20, 50);
        Robot robot1 = new Robot(100, 100);

        Wall wall1 = new Wall(50);
        Track track1 = new Track(51);

        human1.Run(track1.getDinstation(), human1.getRunningLength(), human1.getName(), human1.isState());
        human1.Jump(wall1.getHeight(), human1.getJumpHeight(), human1.getName(), human1.isState());


        cat1.Run(track1.getDinstation(), cat1.getRunningLength());
        cat1.Jump(wall1.getHeight(), cat1.getJumpHeight());

        robot1.Run(track1.getDinstation(), robot1.getRunningLength());
        robot1.Jump(wall1.getHeight(), robot1.getRunningLength());

        System.out.println("А теперь пошли участники на препятствия");

        Human [] humans = new Human[5];
        humans [0] = new Human(10, 20, "Lop", true);
        humans [1] = new Human(25, 90, "Pro", true);
        humans [2] = new Human(80, 100, "Klo", true);
        humans [3] = new Human(50, 70, "Uho", true);
        humans [4] = new Human(10, 50, "Tro", true);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat(75, 25);
        cats[1] = new Cat(80, 40);
        cats[2] = new Cat(65, 14);
        cats[3] = new Cat(25, 40);
        cats[4] = new Cat(54, 100);

        Robot [] robots = new Robot[5];
        robots [0] = new Robot(100, 100);
        robots [1] = new Robot(75, 75);
        robots [2] = new Robot(200, 200);
        robots [3] = new Robot(150, 90);
        robots [4] = new Robot(100, 90);

        Wall [] walls = new Wall[2];
        walls [0] = new Wall(40);
        walls [1] = new Wall(60);

        Track [] tracks = new Track[3];
        tracks[0] = new Track(15);
        tracks[1] = new Track(40);
        tracks[2] = new Track(60);

        for (Human human : humans) {
            for (int i = 0; i < walls.length && human.isState(); i++)  {
                if (human.isState()){
                    human.Jump(walls[i].getHeight(), human.getJumpHeight(), human.getName(), human.isState());
                } else {
                    System.out.println(human.getName() + "больше не идет по препятствиям");
                    break;
                }
            }
            for (Track track : tracks) {
                if (human.isState()){
                    human.Run(track.getDinstation(), human.getRunningLength(), human.getName(), human.isState());
                } else {
                    System.out.println(human.getName() + "больше не идет по препятствиям");
                    break;
                }
            }
        }

    }
}
