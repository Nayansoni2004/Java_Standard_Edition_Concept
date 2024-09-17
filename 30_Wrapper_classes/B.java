class B {
    //main method
    public static void main(String[] args) {
        Byte a = 2;
        Byte b = 3;

        Object c = a + b;

        System.out.println(c instanceof Integer);
    }    
}
/* OUTPUT: true
true output aaya kyuki byte or byte milke int banate h to is-a relationship pass krega object...
*/