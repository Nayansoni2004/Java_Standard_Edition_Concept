public class H {
    public static void main(String[] args) {
        int a = 2;
        int b = a;
        a = 3;
        int c =  2 * (a * b);
        
        System.out.println(c);
        System.out.println((a == b));
    }
}
/*
concept of re-initialization..
OUTPUT
12
false
 */