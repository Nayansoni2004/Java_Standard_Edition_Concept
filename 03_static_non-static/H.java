class Circle {
    int radius;
    static float pi = 3.14f;

    //main method banayenge...
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        Circle c2 = new Circle();
        c2.radius = 100;

        System.out.println(getPI());
        System.out.println(getPI());
    }

    void calcArea() {
        System.out.println(pi * radius * radius);
    }

    static float getPI() {
        return pi;
    }
}
//output:...
//D:\javaprac\3_static_non-static>javac H.java

//D:\javaprac\3_static_non-static>java Circle
//3.14
//3.14