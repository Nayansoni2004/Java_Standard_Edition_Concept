class T {
    //instance level var. member
    int x = 2;
}

class H3 extends T {
    //instance level var. member
    //int x = 7;

    void pro() {
        //int x = 12; //local var. bec. method k andar bana h.

        System.out.println(x);
    }
    //main method
    public static void main(String[] args) {
        H3 h = new H3();

        h.pro();
    }
}
/*  D:\javaprac\19_redefine>java H3
2
child class H3 m instance level member or local var. dono nhi h or kyuki child k ref. var. h k through pro() method
ko call kr rhe h, to java dekhega ki koi local var. nhi h or na hi child ka khud ka instance level member h,to
java dekhega ki koi instance level member parent se inherit hua h kya,bhale hi wo child ka khud ka nhi h,lekin 
parent se inherit to hua h,isley parent ka instance level member call ho jayega...
*/  