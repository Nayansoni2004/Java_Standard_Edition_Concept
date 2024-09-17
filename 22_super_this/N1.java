class N1 {
    //instance-level method
    void pro() {
        System.out.println(this);  //"this" keyword is applicable in instance-level method.

        System.out.println(super.hashCode()); //"super" is also applicable but with the method name.
    }
    //main method
    public static void main(String[] args) {
        N1 x = new N1();

        x.pro();
    }
}
/* OUTPUT:
N1@4617c264    <-ref. code of N1 object,kyuki "this" keyword current instance ki baat krta h.
1175962212     <-hashCode() method k andar jo bhi hoga wo print hua.
*/