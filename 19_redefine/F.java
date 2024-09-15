class X {
    // instance level var. member h.
    int a = 6; //var. declaration cum initialization...
}

interface Y {
    //bydefault static var. member h.
    int a = 12;  //var. declaration cum initialization...
}

class F extends X implements Y {  //interface Y m force contract jo X class ko complete krna padega..mandatory h!
    //main method...
    public static void main(String[] args) {

        F f = new F(); 

        System.out.println(f.a);
    }
}
/* F.java:17: error: reference to a is ambiguous
        System.out.println(f.a);
                            ^
  both variable a in X and variable a in Y match
1 error 
ambiguity situation:jub two var. k name same rakh dete h,to pechan na muskil ho jata h,compiler k liye ki tum kis
                    var. ko access krne ki kosis kr rhe ho..
F child class ka object bana k ref. var. f k through a var. ko call kr rhe h,lekin compiler ko ambiguity situation
ho jayegi isley ,error aai ki var. k name same h or match ho rhe h,to compiler ko batana padega ki kis ko call
kr rhe ho tum...this we will see in F1.java example...
*/
