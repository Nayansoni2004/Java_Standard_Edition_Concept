class W1 {
    //instance-level var. member
    int y = 9;

    W1() {
        this();
        System.out.println(y);
    }
    //main method
    public static void main(String[] args) {

        W1 x = new W1();

        System.out.println(x.y);
    }
}
/* W1.java:5: error: recursive constructor invocation
    W1() {
    ^
1 error
W1()constructor k andar this();call hoga jo ki apni hi class k constructor W1()ko wapis call krega,to W1()constructor
wapis call hoga or usme this();call likha hoga, to wo wapis W1()constructor ko call krega,or is situation m
W1()constructor recursively bar bar call hoga or stack up hota jayega stack m,to W1()constructor infinite call
pe chala jayega,or ye stack ki overflow condition ko occur krega.  */