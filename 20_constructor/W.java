class E1 {
    //programmer supplied constructor
    E1() {
        this(2);
    }
    //programmer supplied (SINGLE PARAMETERIZED)constructor
    E1(int y) {
        this();
    }
}

class W {
    //main method
    public static void main(String[] args) {

        E1 x = new E1(12);

    }
}
/* W.java:3: error: recursive constructor invocation
    E1() {
    ^
1 error
class m kisi 1 constructor k pas super call hona chahiye,nhi to recursion occur hoga, E1 class m two overloaded
constructor h or kisi 1 k pas bhi super call nhi h,or jaise hi E1()constructor call hoga to usme 12 integer value
as a single parameter assign h to (int y) constructor call hoga usme m this();call hoga jo apni hi class k overloaded
constructor ko call krega, to E1()constructor call hoga usme bhi this();call hoga to E1()constructor apni class
k overloaded constructor ko call krega to (int y)constructor stack up ho jayega or kyuki call khatam hi nhi
hoga to object initialize nhi ho payega,isley error aai,or sirf isley atleast class k 1 constructor k pas super();
call hona chahiye!  */
