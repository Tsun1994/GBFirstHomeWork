package homeworksix;

public class Dog extends Animal {

    String color;
    String name;

    public Dog (String name, String color){
        this.name = name;
        this.color = color;
    }
    public void dogRun(int dinst){
        String ogr = "";
        if (dinst > 500) {
            dinst = 500;
            ogr = ": собаке плохо после пятиста метров, дайте ей отдохнуть";
        }
        System.out.println(name + " пробежал " + dinst + " метров" + ogr);
    }
    public void dogSwim (int dinst){
        String ogr = "";
        if (dinst > 10) {
            dinst = 10;
            ogr = ": собака проплыла и устала, ей надо отдохнуть, вернитесь позже";
        }
        System.out.println(name + " проплыл " + dinst + " метров" + ogr);
    }
}
