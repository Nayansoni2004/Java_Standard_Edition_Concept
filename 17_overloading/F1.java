//METHOD OVERLOADING: MULTIPLE METHODS WITH THE SAME NAME BUT WITH DIFFERENT PARAMETERS.
class F1 {

    //methods...
    void add() {

    }

    int add(int x, int y) {
        return 0;
    }
}

/* .........happily compiled............
method overloading m method k return type se koi farq nhi padta,return type void ho ya int ho,koi farq nhi padta,
method public ho ya private ho ya final ho,static ho ya non-static ho us se bhi koi farq nhi padta,bs method ka
name same or parameter body mis-match hona chahiye,tabhi legal method overloading mani jayegi.
*/