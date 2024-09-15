//This code is not designed correct from the design point of view...
//method overloading!!!
class N {
    //main method...
    public static void main(String[] args) {

    }
          //method members...
    static void calcSqr(int w, char x) {
        //print square root
    }

    static void calcSqr(int w, float x) {
        //print square
    }
}   //~~~HAPPILY COMPILED AND RUNNED~~~
/*methods k name same h,or same method se 2 task perform nhi krwa sakte,even multiple task perform nhi krwa sakte
ik hi method se,matlab calcSqr method se (square) bhi calculate kr rhe h or (squareroot) bhi calculate kr rhe h,
bhale hi parameter mis-match h lekin jub calcSqr method ko call krenge to usi method se square or squareroot dono
calculate nhi kr sakte,koi 1 hi calculate kr sakte h,means kisi method se only one task perform krwa sakte h,
matlab 1 method kewal 1 specific task ko perform krne k liye banai jati h,lekin N class ki dono methods k name
same h or parameters mis-match h isley method overloading to hogi hi,but isley design point of view se code sahi
tarike se Design nhi h.
*/