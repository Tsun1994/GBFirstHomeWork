package homeworksix;

public class Animal {
    String name;
    String color;

    public Animal(){
    }

    public Animal(String name, String color){
        this.color = color;
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name + " цвет: " + color);
    }

    public void animalRun (int dinst){
        System.out.println("Некое неизвестное животное " + name + " пробежало " + dinst + " метров");
    }
    public void animalSwim (int dinst){
        System.out.println("Некое неизвестное животное " + name + " проплыло " + dinst + " метров а может оно могет и больше");
    }

}
