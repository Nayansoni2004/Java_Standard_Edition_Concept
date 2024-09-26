class G1 {
    static void pro(int... x) {
        //iterating array of primitive type int through enhanced for-loop.
        for(int next : x) 
            System.out.println(next);
    }

    //main method
    public static void main(String[] args) {
        byte a = 23;
        short b = 56;
        char c = 'A';
        long e = 34;

        pro(a, b , c, e);
    }
}
/*OUTPUT: error aayega kyuki internally int[]<-array create hoga to usme byte,short,char variables to store ho
          jayenge lekin long variable store nhi hoga or compilation fail ho jayega.
D:\javaprac\47_var_args>javac G1.java
G1.java:15: error: method pro in class G1 cannot be applied to given types;
        pro(a, b , c, e);
        ^
  required: int[]
  found:    byte,short,char,long
  reason: varargs mismatch; possible lossy conversion from long to int
1 error
 */