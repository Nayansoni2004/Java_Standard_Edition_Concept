class Y2 {
    
    void pro() {
        System.out.println("pro in Y2");
    }
}

class E1 extends Y2 {

    //void pro() {
    //    System.out.println("pro in Y2");
    //}
    //main method 
    public static void main(String[] args) {

        Y2 x = new E1();  //polymorphic assignment

        x.pro();  //polymorphic method call/invocation
    }
}
/*  OUTPUT:     pro in Y2
polymorphic assignment h lekin,overriding nhi hui isley DYNAMIC METHOD DISPATCH bhi occur nhi hua,or runtime ne
OBJECT KA TYPE BHI CHECK NHI KIA,kyuki parent ki method inherit ho rhi h,lekin refine(override) nhi ho rhi,isley
compiler var. ka type check krega or var. class Y2 parent type ka h,isley parent ka method version run hua.
*/