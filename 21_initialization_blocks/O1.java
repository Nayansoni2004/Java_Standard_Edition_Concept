class O1 {
    //main method 
    public static void main(String[] args) {
        Animal x = new Dog();//the ref. code of child class can be hold in obj. ref. var. of parent class.

        BDog y = (BDog)x; //type casting ho rhi h.
    }
}

class Animal { }

class Dog extends Animal { }

class BDog extends Dog { }
/* Exception in thread "main" java.lang.ClassCastException: class Dog cannot be cast to class BDog (Dog and BDog are in unnamed module of loader 'app')
        at O1.main(O1.java:6)
compile time error nhi aai kyuki code gramatically,syntaxtically correct h,compilation pass,but runtime pr class
load hua or exception aya kyuki hum Dog child class ka ref. code parent class var. m rakh sakte h,or second 
instruction m hum bol rhe h ki parent animal type k var. x m jo Dog class ka ref. code rakha h,usko BDog m 
type cast mtlb convert kr do,lekin parent ko pta hi nhi h ki uske kitne child h to parent ka ref. code child m 
nhi rakh sakte,to hum Dog intermediate parent class ka ref. code child class BDog m kese rakh sakte h,mtlb parent 
Dog child BDog jese behave nhi kr sakta, or hum x parent Dog ka ref. code BDog child m rakh rhe h isley exception
occur hua ki class Dog cannot be cast to class BDog...*/