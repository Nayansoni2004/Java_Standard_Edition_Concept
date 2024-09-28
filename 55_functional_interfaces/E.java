@FunctionalInterface
interface X3 {
    void pro();//<-overridden method..
}

@FunctionalInterface
interface E extends X3 {
    void pro();//<-overriding method...
}


/*OUTPUT: happily compiled########
D:\javaprac\55_functional_interfaces>javac E.java
 */