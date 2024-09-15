class Shape {
    //instance level var. members
    int length;
    int width;
    int height;
     
    //programmer supplied constructor...
    public Shape(int length, int width, int height) {
        System.out.println("3");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Shape(int length, int width) {
        System.out.println("2");
        this.length = length;
        this.width = width;
    }

    public Shape(int length) { 
        System.out.println("1");
        this.length = length;
    }
}

class O {
    //main method
    public static void main(String[] args) {
        
        Shape s = new Shape(12, 13, 14);

        System.out.println(s.length + "-" + s.width + "-" + s.height);
    }
}
/* OUTPUT: 
3
12-13-14
  happily compiled.....
  but jo kam 1 parameterized constructor kr rha h wahi kam 2 parameterized constructor ko bhi krna pad rha h,or
  jo kam 1 or 2 parameterized constructor kr rhe h wahi kam 3 parameterized constructor ko bhi krna pad rha h,
  isley O1.java m hum this()parenthesis statement ka use krke overload constructor se wahi kam krwa lege,
  matlab 1 parameterized constructor se hi wo kam krwayenge taki 2 parameterized constructor ko wo kam na krna 
  pade,1 parameterized constructor call ho stack memory k through or wo apna kam kr k de dega,2 parameterized 
  constructor.
  exlanation through stack memory in java-copy O1.java example. */