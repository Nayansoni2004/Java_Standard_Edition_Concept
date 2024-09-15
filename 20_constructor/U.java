class JJ {
    //programmer supplied constructor....
    private JJ() {

    }
}

class U {
    //main method...
    public static void main(String[] args) {

        JJ x = new JJ();

    }
}
/* U.java:12: error: JJ() has private access in JJ
        JJ x = new JJ();
               ^
1 error
error aai kyuki hum JJ class ka ref. var. to bana sakte h,lekin Object nhi bana sakte,kyuki Object banayenge to
JJ()constructor call hoga,jo ki Object ko initialize krega,but JJ()constructor private h jo ki kewal JJ class k
andar accessible h to JJ constructor access hi nhi hoga to object nhi ban payega isley errro aai.
*/