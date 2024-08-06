import java.util.*;
 interface Functional{
    void add(int a,int b);
}

public class D61 {
    public static void main(String[]args){
        Functional obj=(int a,int b)->System.out.println(a+b);
        obj.add(10,20);
    }
    
}