class N {
    //instance-level method
    void pro() {
        System.out.println(this); //"this" keyword is applicable in instance-level method.
        System.out.println(super); //but kewal "super" nhi likh sakte.
    }
}
/* N.java:5: error: '.' expected
        System.out.println(super);
                                ^
1 error
error aai kyuki usko batana padega ki super m object class ki kis instance-level method ko call kr rhe h. kyuki 
N class ka koi parent humne nhi banaya h or super likh k call kr rhe h pta nhi kise...*/