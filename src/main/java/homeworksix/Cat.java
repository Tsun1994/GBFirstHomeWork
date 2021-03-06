package homeworksix;

public class Cat extends Animal {
    String color;

    public Cat (String name, String color){
        this.name = name;
        this.color = color;
    }

    public void catInfo (){
        System.out.println("Имя кота: " + name + " цвет: " + color);
    }
    public void catRun (int dinst) {
        String ogr = "";
        if (dinst > 200) {
            dinst = 200;
            ogr = ": котик не может бежать больше двухста метров, котик устал(";
        }
        System.out.println(name + " пробежал " + dinst + " метров" + ogr);
    }

    public void catSwim (int dinst){
        System.out.println(name + " не может плавать, срочно вытащите его из воды, он же кот");
    }
}
