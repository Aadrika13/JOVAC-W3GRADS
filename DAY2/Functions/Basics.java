package DAY2.Functions;

public class Basics {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        sayHello();
//        int c = a + b;
//        System.out.println(c);
        System.out.println(a + " " + b);
        //call by value 
        //it does not swap because the function does not change the values in the stack
        swap(a , b);
        System.out.println(a + " " + b);
    }

    static void sayHello(){
        System.out.println("Hello ");
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
