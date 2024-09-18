import java.io.IOException;

class X1 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class Y1 extends X1 {
    //legal method over-riding: SAME
    void pro() throws IOException {
        System.out.println("Hello");
    }
}
/*OUTPUT: happpily compiled but run nhi hoga kyuki main method nhi h.... */