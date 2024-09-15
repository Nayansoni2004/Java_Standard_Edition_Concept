class Q {
    //main method...
    public static void main(String[] args) {
        /* OPERATOR OVERLOADING: (java does not support operator overloading) */

        System.out.println(12 + 14);
        System.out.println(1.2 + 1.3);
        System.out.println(10 + 1.3);
        System.out.println("om" + 13);
        System.out.println("om" + "ji");
        System.out.println("om" + true);
        System.out.println("om" + new Student());
        //System.out.println("om" * 3);//error occured because of this line only in P.java example.
    }
}

class Student {

}
/* OUTPUT: happily compiled and runned....
26
2.5
11.3
om13
omji
omtrue
omStudent@23fc625e  
*/