package CodingMarathon;

import java.util.Arrays;

public class BoatstoSavePeople {
    public static void main(String[] args) {
        int[] people  = {2,4};
        int limit = 5;
        System.out.println(numRescueBoats(people, limit));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int boats = 0;
        int i = 0;
        int j = people.length - 1;
       
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }
            else{
                j--;
            }
            boats++;
        }
        return boats;
    }
}
