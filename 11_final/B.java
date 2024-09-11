class Y {

    int w = 45;//variable declaration cum initialization

    void pro() {
        System.out.println("pro member method is accessed...");
    }
}

class B extends Y {

    //main method 
    public static void main(String[] args) {

        B b = new B();
        
        System.out.println(b.w);

        b.pro();
    }
}
/* OUTPUT:-45
pro member method is accessed...

member variable and member method of Y class is accessed in child class B through inheritance and by creating 
the object of child class B.  */