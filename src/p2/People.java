package p2;

import java.util.Objects;

public class People /*implements Comparable<People>*/{

    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

 /*   @Override
    public int compareTo(People o) {

        if (name.length() == o.getName().length() && age>o.getAge()){
            return 1;
        }
        else if(name.length() == o.getName().length() && age<o.getAge()){
            return -1;
        } else if (name.equals(o.getName()) && age==o.getAge()) {
            System.out.println(o.getName());
            return 0;
        }else{
            return name.compareTo(o.getName());
        }
    }*/
}
