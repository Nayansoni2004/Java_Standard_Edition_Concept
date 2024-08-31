class Circle {
    int radius;
    static float pi = 3.14f;

    //main method banayenge...
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        Circle c2 = new Circle();
        c2.radius = 100;

        c2.calcArea();
        c1.calcArea();
    }

    void calcArea() {
        System.out.println(pi * radius * radius);
    }
}
//output:...
//31400.0
//314.0