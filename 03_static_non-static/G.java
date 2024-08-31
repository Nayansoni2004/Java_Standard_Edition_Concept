class Circle {
    int radius;
   static float pi = 3.14f;

   //main method banayenge...
   public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.radius = 10;
    Circle c2 = new Circle();
    c2.radius = 100;

    getPI();
    getPI();
   }

   void calcArea() {
    System.out.println(pi * radius * radius);
   }

   float getPI() {
    return pi;
   }

}
//output:...
//G.java:12: error: non-static method getPI() cannot be referenced from a static context
//    getPI();
//    ^
//G.java:13: error: non-static method getPI() cannot be referenced from a static context
//    getPI();
//    ^
//2 errors