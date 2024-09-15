class G1 {
    //instance level var. member
    int a = 9;

    void pro() {
        int a = 5; //local var. h kyuki method k andar bana h.
        System.out.println(a); 
    }
    //main method 
    public static void main(String[] args) {

        G1 g = new G1();

        g.pro();
    }
}
/* D:\javaprac\19_redefine>java G1
5
method k andar ka local var. print hua,kyuki java bolta h pahle m local var. dekhunga,agar tumne banaya h,to me
usko call krunga,agar nhi banaya h,to fir instance member ko call krunga,agar wo bhi nhi h to error aaigi
:cannot find symbol.<- in G2.java example...
*/