class I extends D{
    //main method...
    public static void main(String[] args) {
        I i = new I();
        
        i.pro();
    }
}

class D {
    void pro() {
        System.out.println("Hello Duniya Waloon...!!!");
    }
}
//kyuki extends keyword likhne se child class I ne class D ki sari properties
//inherit kr li h isley ab hum object class I ka hi bana lenge.
//Hello Duniya Waloon...!!!
//1 or imp. baat jub I child class h to usko kyu run krnege?ans-
//isley kyuki uske pas main method h bs itna dhyan rakhna h.