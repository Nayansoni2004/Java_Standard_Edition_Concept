class E2 {
    //main method
    public static void main(String[] args) {
        Boolean a = new Boolean(true);
        Boolean b = new Boolean(true);
        Boolean c = new Boolean(true);
        // a b c var. k ref. code ka comparison kr rhe h...
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
    }    
}
/*OUTPUT:  false aayega kyuki new se har bar new object non-pool memory m banega or har object ka ref. code alag 
alag hoga.....
E2.java:4: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
        Boolean a = new Boolean(true);
                    ^
E2.java:5: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
        Boolean b = new Boolean(true);
                    ^
E2.java:6: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
        Boolean c = new Boolean(true);
                    ^
3 warnings

D:\javaprac\30_Wrapper_classes>java E2
false
false
false
*/