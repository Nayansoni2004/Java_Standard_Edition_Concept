interface Golu {

}

class Bus {

}

class W1 {
    //main method
    public static void main(String[] args) {
        Golu j = null;

        System.out.println(j instanceof Object);

        System.out.println(j instanceof Bus);
    }
}
/*OUTPUT: interface ka koi parent class nhi hota,kewal parent interface hota h,fir hum interface ka ref. var.
          isley banate h,taki us ref. var. m hum interface k kisi implementer class k object ka ref. code hold
          kr sake.
D:\javaprac\46_enum>javac W1.java

D:\javaprac\46_enum>java W1
false <-aya bec. interface ka koi parent class nhi hota.
false <-aya kyuki class Bus interface Golu ko implements nhi krta h,or hum instanceof mtlb is-a test kr rhe h to
        false hi aayega.
 */