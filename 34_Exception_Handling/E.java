import java.io.IOException;

class X2 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class Y2 extends X2 {
    //legal method over-riding: FEWER case <-for more understanding see in java copy...
    void pro() {
        System.out.println("Hello");
    }
}
/*OUTPUT: happily compiled because of FEWER category!!! */