//final keyword ka example no.3
final class U {

    int w = 78;

    void pro() {
        System.out.println("Namaskaram");
    }
}

class H {

    //main method
    public static void main(String[] args) {

        U u = new U();

        System.out.println(u.w);

        u.pro();
    }
}
/* OUTPUT:-78
           Namaskaram
final keyword se marked U class ka object banake matlab(instantiation k through)H class m final class U k members 
ko access kr sakte h. */

