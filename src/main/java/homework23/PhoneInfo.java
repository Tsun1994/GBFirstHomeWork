package homework23;

import java.util.LinkedList;
import java.util.List;

public class PhoneInfo {
    public List<String> nameInfo = new LinkedList<>();
    public List<String> phoneInfo = new LinkedList<>();
    public void PhoneInfo (List<String> nameInfo, List <String> phoneInfo) {
        this.nameInfo = nameInfo;
        this.phoneInfo = phoneInfo;
        this.nameInfo.add("Lopuh");
        this.nameInfo.add("Arnold");
        this.nameInfo.add("Faras");
        this.nameInfo.add("Faras");
        this.nameInfo.add("Forgot");
        this.nameInfo.add("Genomi");
        this.nameInfo.add("Genomi");
        this.nameInfo.add("Fokus");
        this.nameInfo.add("Pokus");
        this.nameInfo.add("Lopuh");
        this.nameInfo.add("Pol");
        this.nameInfo.add("Londa");
        this.nameInfo.add("Frogerr");
        this.nameInfo.add("Lopuh");
        this.phoneInfo.add("52452");
        this.phoneInfo.add("12545");
        this.phoneInfo.add("15214");
        this.phoneInfo.add("4564621");
        this.phoneInfo.add("452123");
        this.phoneInfo.add("121335");
        this.phoneInfo.add("5464623");
        this.phoneInfo.add("42425");
        this.phoneInfo.add("45456");
        this.phoneInfo.add("214567");
        this.phoneInfo.add("546777");
        this.phoneInfo.add("54646");
        this.phoneInfo.add("457568");
        this.phoneInfo.add("45466");
    }

    public static void printInfo (List<String> nameInfo, List <String> phoneInfo, int i){
        System.out.println(nameInfo.get(i) + " " + phoneInfo.get(i));
    }

    public static void addInfo (List<String> nameInfo, List <String> phoneInfo, int i){
        System.out.println(nameInfo.get(i) + " " + phoneInfo.get(i));
    }


    public void setNameInfo(List<String> nameInfo) {
        this.nameInfo = nameInfo;
    }

    public void setPhoneInfo(List<String> phoneInfo) {
        this.phoneInfo = phoneInfo;
    }

    //    public static void getInfo(List<String> nameInfo, int i) {
//        for (int j = 0; j < nameInfo.size(); j++) {
//            if
//        }
//    }
}
