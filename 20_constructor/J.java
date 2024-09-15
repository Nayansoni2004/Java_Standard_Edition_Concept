class DD {
    //instance level var. memeber
    int y = 9;

    void pro() {
        System.out.println("Dholu");
    }
}

class EE extends DD {
    //instance level var. member
    boolean w;

    void info() {
        System.out.println("Bholu");
    }
}

//test class
class J {
    //main method 
    public static void main(String[] args) {

        EE x = new EE();

        System.out.println(x.y);
        System.out.println(x.w);

        x.pro();
        x.info();
        x.toString();
        x.hashCode();
    }
}
/* this code is executed through stack process and object creation in heap memory....
D:\javaprac\20_constructor>java J
9
false
Dholu
Bholu   */ 