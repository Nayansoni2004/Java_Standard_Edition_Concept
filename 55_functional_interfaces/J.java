@FunctionalInterface
interface Y4 {
    int ccc(int x, int y);
}
/* 
class U4 implements Y4 {
    public int ccc(int x, int y) {
        int sum = 0;
        sum = x + y;
        return sum;
    }
} */
/*
public int ccc(int x, int y) {
        int sum = 0;
        sum = x + y;
        return sum;
    }

(x, y) -> {
    int sum = 0;
    sum = x + y;
    return sum;
};
 */

class J {
    //main method
    public static void main(String[] args) {
        //Y4 s = new U4();//polymorphic assignment...
        Y4 s = (x, y) -> {
            int sum = 0;
            sum = x + y;
            return sum;
        };

        //System.out.println(s.ccc(2, 3));
        System.out.println(s.ccc(22, 33));
    }    
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac J.java

D:\javaprac\55_functional_interfaces>java J
5 <-overriding method ka output...

D:\javaprac\55_functional_interfaces>javac J.java

D:\javaprac\55_functional_interfaces>java J
55 <-lambda expression ka output...
 */