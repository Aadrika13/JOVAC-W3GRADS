package DAY3;

import java.util.*;
public class ArrayList_Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);//[1]
        list.add(1,2);//[1,2]
        //list.add(5,2); error as the list size is 2 
        list.add(1,20);//[1,20,2]
        list.set(1,30);//[1,30,2] overwrites the value
        System.out.println(list.get(1));//30 prints the value at index 1
    }
}
