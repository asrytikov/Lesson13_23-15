package p2;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Masha");
        names.add("Dasha");
        names.add("Roman");
        names.add("Katya");
        names.add("Alex");

        System.out.printf("Set contains %d elements \n", names.size());

        //names.remove("Roman");
        for (String name : names){
            System.out.println(name);
        }

        System.out.println("-------------------------");

        System.out.println(names.first());
        System.out.println(names.last());

        SortedSet<String> set = names.subSet("Alex", "Masha");
        System.out.println(set);

        String d = names.higher("Alex");
        System.out.println(d);
        System.out.println(names.lower("Dasha"));
        NavigableSet<String> dSet = names.descendingSet();
        System.out.println(dSet);
        SortedSet<String> hSet = names.headSet("Katya");
        System.out.println(hSet);
        SortedSet<String> tSet = names.tailSet("Katya");
        System.out.println(tSet);

        //PeopleComparator peopleComparator = new PeopleComparator();
        Comparator<People> comparator = new PeopleComparator().thenComparing(new PeopleAgeComparator());
        TreeSet<People> people = new TreeSet<>(/*peopleComparator*/comparator);
        people.add(new People("Masha", 19));
        people.add(new People("Masha", 20));
        people.add(new People("Dasha", 19));

        for (People p : people){
            System.out.println(p);
        }


    }

}
