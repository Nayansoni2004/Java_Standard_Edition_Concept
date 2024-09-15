class G {
    //instance level var. member...
    int a = 9;

    void pro() {
        //int a = 5; <-local var. h,kyuki method k andar bana h.
        System.out.println(a);
    }
    //main method
    public static void main(String[] args) {

        G g = new G();

        g.pro();
    }
}
/* D:\javaprac\19_redefine>java G
9 
method ko call krne pr pahle method apne andar dekhega ki koi local var. h kya,agar h to wo call hoga,agar nhi h
to wo dekhega ki koi instance level member h kya,agar h to fir wo call hoga,agar wo bhi nhi h to fir error aayegi
:cannot find symbol.
kyuki G class m pro method m local var. nhi h isley instance level member print hua.
*/