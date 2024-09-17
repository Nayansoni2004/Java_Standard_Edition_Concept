class G1 {
    //main method
    public static void main(String[] args) {
        Character a = Character.valueOf('A');
        Character b = Character.valueOf('A');
        Character c = Character.valueOf('A');
        //a b c ref. var. k through object m rakhi values ka comparison ho rha h....
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
    }    
}
/*OUTPUT:  object constant pool memory m banega or usi object ka ref. code a b or c var. m hold ho jayega or 
values compare kr rhe h valueOf method se to values same h to true output aayega....
true
true
true
*/