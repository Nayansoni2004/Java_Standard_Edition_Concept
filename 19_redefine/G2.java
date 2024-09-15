class G2 {
    //instance level var. member
    //int a = 5;

    void pro() {
        //int a = 9; //local var. kyuki method k andar bana h.
        System.out.println(a);
    }
    //main method
    public static void main(String[] args) {

        G2 g = new G2();

        g.pro();
    }
}
/* G2.java:7: error: cannot find symbol
        System.out.println(a);
                           ^
  symbol:   variable a
  location: class G2
1 error

error aai kyuki compiler ko na hi local var. mila or na hi instance level member mila,or jo member class m h hi
nhi usko tum access kr rhe ho,isley error aai :cannot find symbol!
*/