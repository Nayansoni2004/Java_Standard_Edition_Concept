class X {
    //non-static over-ridden method member
    static void pro() {
        System.out.println("Hi");
    }
}

class X1 extends X {
    //non-static overriding method member
    static void pro() {
        System.out.println("Hello");
    }
}

//test class
class D {
    //main method 
    public static void main(String[] args) {
        
        X x = new X1();  //polymorphic assignment

        x.pro(); //jub bhi var. ka use krke method ko call krte h,to compiler var. ka type check krta h.
      //X.pro();<-ye line compiler hamare behalf m likh deta h...
    }
}  //OUTPUT: Hi
/* jub bhi parent m method static hota h,or child m over-ride krte h,to method overhide hota h,kyuki static methods
compile time pr resolve ho jati h,to dyanmic method dispatch nhi hota,static methods are not a part of dynamic 
method dispatch, or compiler var. ka type check kr k code pass kr deta h,or over-riding nhi hui isley DYNAMIC 
METHOD DISPATCH occur nhi hua or runtime pr bhi parent class ka overridden method version run hua.
*/