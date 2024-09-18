import java.io.IOException;
import java.io.FileNotFoundException;

class X4 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class Y4 extends X4 {
    //legal method over-riding:NARROWER
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }
}
/*OUTPUT: happily compiled...over-riding method m NARROWER exceptions likhe h,throws keyword se declare bhi kiye
          h,Absolutely legal h!!!
 */