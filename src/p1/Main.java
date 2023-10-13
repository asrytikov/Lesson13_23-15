package p1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Masha");
        names.add("Dasha");
        names.add("Roman");

        boolean check = names.add("Roman");
        System.out.println(check);

        System.out.printf("Set contains %d elements \n", names.size());
        names.remove("Roman");
        for (String name : names){
            System.out.println(name);
        }

        HashSet<People> people = new HashSet<>();
        people.add(new People("Masha", 19));
        people.add(new People("Masha", 20));
        people.add(new People("Dasha", 19));

        for (People p : people){
            System.out.println(p);
        }





    }
}
