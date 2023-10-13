package dz7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> arrList = new ArrayList<>();
        List<Object> linkList = new LinkedList<>();
        System.out.println(addElements(arrList));
        System.out.println(addElements(linkList));
    }

    public static long addElements(List list){
        long result = 0;
        long startTime = System.currentTimeMillis();
        Object obj = new Object();
        for(int i =0; i<500000; i++){
            list.add(obj);
        }
        result = System.currentTimeMillis() - startTime;
        return result;
    }
}

