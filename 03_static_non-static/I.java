class Circle {
    int radius;
    static float pi = 3.14f;

    //main method banayenge ab...
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        Circle c2 = new Circle();
        c2.radius = 100;

        defineCircle();
    }

    void defineCircle() {
        System.out.println("Circle is a ......");
    }

    void calcArea() {
        System.out.println(pi * radius * radius);
    }

    static float getPI() {
        return pi;
    }
}
//output:...
//I.java:12: error: non-static method defineCircle() cannot be referenced from a static context
//        defineCircle();
//        ^
//1 error