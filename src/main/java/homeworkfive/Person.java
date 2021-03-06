package homeworkfive;

public class Person {
    public String name;
    public String position;
    public String mail;
    public String phone;
    public int pay;
    public int age;

    public static void main (String [ ] args) {
        Person pers = new Person("Ivan Ivanov", "velosity", "jon@mail.ypo", "4555412", 15000, 25);
        System.out.print(pers.name + " " + pers.position + " " + pers.mail + " " + pers.phone + " " + pers.pay + " " + pers.age);
        System.out.println();
        Person [] person = new Person[5];
        person[0] = new Person("Ivan Ivanov", "velosity", "jon@mail.ypo", "4555412", 15000, 25);
        person[1] = new Person("Kola Jdanov", "programmist", "jfdgn@mail.ypo", "4545412", 45000, 41);
        person[2] = new Person("Vasia Vasev", "menedger", "pony@mail.ypo", "45213412", 12000, 28);
        person[3] = new Person("Mosl Markov", "lopata", "whoareyou@mail.ypo", "4422", 15254, 45);
        person[4] = new Person("Petr Petrov", "alfa", "whyyyyy@mail.ypo", "4554212", 4000, 56);
        System.out.println("Сотрудники старше 40 лет");
        for (Person value : person) {
            if (value.age > 40) {
                System.out.print(value.name + " " + value.position + " " + value.mail + " " + value.phone + " " + value.pay + " " + value.age);
                System.out.println();
            }
        }
    }

    Person (String name, String position, String mail, String phone, int pay, int age){
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }
}
