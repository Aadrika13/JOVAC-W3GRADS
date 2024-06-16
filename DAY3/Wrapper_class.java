package DAY3;

public class Wrapper_class {
    public static void main(String[] args) {
        int a = 10;//primitive data type(stored in stack memory)
        Integer b = 20;//wrapper class(stored in heap memory)

        int [] arr = {1,2,3,4,5};
        System.out.println(a);//10
        System.out.println(b);//20
        System.out.println(arr);//base address

        //autoboxing
        Integer c = 10;
        int d = c;
        System.out.println(c);//10
        System.out.println(d);//10

        //unboxing
        Integer e = 10;
        int f = e;
        System.out.println(e);//10
        System.out.println(f);//10

        int x = 10;
        int y = 10;
        System.out.println(x==y);//true

        Integer A = 27;
        Integer B = 27;
        System.out.println(A==B);//true

        Integer C = 199;
        Integer D = 199;
        System.out.println(C==D);//false

        //Integer, Short, Long, Byte Range => -128 to 127
        //Only range between the above range no new memory is allocated for the variables otherwise new memory is allocated to the variables

    }
}
