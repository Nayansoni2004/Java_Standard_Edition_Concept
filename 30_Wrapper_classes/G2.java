class G2 {
    //main method
    public static void main(String[] args) {
        Character a = new Character('A');
        Character b = new Character('A');
        Character c = new Character('A');
        //a b or c var. m rakhe object k ref. code ka comparison ho rha h...
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(a.equals(b)); //a b or c var. k through object m rakhi values ka comparison ho rha h...
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));
    }  
}
/*OUTPUT:
G2.java:4: warning: [removal] Character(char) in Character has been deprecated and marked for removal
        Character a = new Character('A');
                      ^
G2.java:5: warning: [removal] Character(char) in Character has been deprecated and marked for removal
        Character b = new Character('A');
                      ^
G2.java:6: warning: [removal] Character(char) in Character has been deprecated and marked for removal
        Character c = new Character('A');
                      ^
3 warnings

D:\javaprac\30_Wrapper_classes>java G2
false
false
false
~~~~~~~~~~~~~~~~~~~~~~
true
true
true
*/