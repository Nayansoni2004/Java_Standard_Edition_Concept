class P {
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
        System.out.println("om" * 3);//error occured because of this line only.
    }
}

class Student {

}
/* P.java:13: error: bad operand types for binary operator '*'
        System.out.println("om" * 3);
                                ^
  first type:  String
  second type: int
1 error

Binary Operator ko Two Operands chahiye hota h,Operation ko perform krne k liye,error aai kyuki String 
concatenation m pahla type operand ka String h or Second type int h,jo ki concate nhi ho sakte,kyuki java 
OPERATOR OVERLOADING ko support nhi krta h.
*/ 