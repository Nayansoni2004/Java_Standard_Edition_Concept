//final keyword ka example no.4
final class X {

    String name ="Nayan";//variable declaration cum initialization

}

class I {

    //main method
    public static void main(String[] args) {

        X x = new X();//object creation.

        System.out.println(x.name);//access through instantiation

        x.name ="Drishti";//redefining the var. of X class in I class,possible bec. var. of X class is not final. 

        System.out.println(x.name);//print the redefined var.
    }
}
/*OUTPUT:Nayan
         Drishti
X class final mark h isley X class ko inheritance k through access nhi kr sakte,but X class ka variable final mark
nhi h isley usko access bhi kr sakte h,or modify bhi kr sakte h,or access kewal instantiation k through kr sakte
h,matlab I class m X class ka instance(object) bna k bs access kr sakte h.   */