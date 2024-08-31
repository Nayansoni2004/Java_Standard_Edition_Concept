class Circle {
    int radius;
    static float pi = 3.14f;

    //main method banayenge...
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        Circle c2 = new Circle();
        c2.radius = 100;

        c1.defineCircle();
        c2.defineCircle();
    }

    void defineCircle() {
        System.out.println("Circle is a ...");
    }

    void calcArea() {
        System.out.println(pi * radius * radius);
    }

    static float getPI() {
        return pi;
    }
}
//output:...
//Circle is a ...
//Circle is a ...