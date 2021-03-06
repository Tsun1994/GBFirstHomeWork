package homeworksix;

public class Action {
    public static void main (String [] args){
        Animal animal = new Animal("Борис", "red");
        Cat cat = new Cat("Пушистик", "black");
        Dog dog = new Dog("Бобик", "white");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
        cat.catRun(210);
        dog.dogRun(600);
        animal.animalRun(400);
        animal.animalSwim(400);
        cat.catSwim(41);
        dog.dogSwim(15);
        Cat cat1 = new Cat("Вася", "green");
        cat1.catRun(150);
        cat1.catSwim(10);
        cat1.catInfo(); //не совсем понимаю пункт про подсчет созданных котов, собак и других животных
    }
}
