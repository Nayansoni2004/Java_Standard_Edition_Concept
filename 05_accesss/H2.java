class H2 {

    //main method...
    public static void main(String[] args) {
        Z.pro();
    }
}

class Z {
    void pro() {
        System.out.println("Hello Zeba MAM...!!!");
    }
}
//conclusion:kyuki void pro() non-static method h Z class ka or non-static method ko static context m direct access nhi 
//sakte h isley error aai.
//H2.java:5: error: non-static method pro() cannot be referenced from a static context
//        Z.pro();
//         ^
//1 error