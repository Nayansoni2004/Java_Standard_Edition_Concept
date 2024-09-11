class O {

    final int x = 001;//variable declaration cum initialization

    //main method 
    public static void main(String[] args) {

        O o = new O();//object creation.....

        System.out.println(o.x);

        o.x = 100;//modifying the value of final variable x...

        System.out.println(o.x);
    }
}
/* O.java:12: error: cannot assign a value to final variable x
        o.x = 100;//modifying the value of final variable x...
         ^
1 error

final keyword se marked variable ko modify nhi kr sakte ,java final variable m modification allowed nhi krta h.

*/