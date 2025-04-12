interface Y {  }

class YZ implements Y {  }

class P {
    public static void main(String[] args) {
        // Case 3:
        Y x = new YZ();

        // Case 2:
        // Y x = new Y();
        // P.java:8: error: Y is abstract; cannot be instantiated
        // Y x = new Y();
        //       ^
        // 1 error
        
        // Case 1:
        // Y x;
    }
}
/*
happily compiled in CASE 1 & in CASE 3.

compilation failed for CASE 2 because we can make interface ref. variable but we cant make interface object, 
assigning a subclass object in parent interface ref. var. is valid.
 */