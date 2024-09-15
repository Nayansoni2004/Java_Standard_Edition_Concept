class Shape {
    //instance level var. members
    int length;
    int width;
    int height;

    //programmer supplied constructro...
    public Shape(int length, int width, int height) {

        this(length, width);
        System.out.println("3");
        //this.length = length;
        //this.width = width;
        this.height = height;
    }

    public Shape(int length, int width) {
         
        this(length); 
        System.out.println("2");
        //this.length = length;
        this.width = width;
    }

    public Shape(int length) {

        System.out.println("1");
        this.length = length;
    }
}

class O1 {
    //main method
    public static void main(String[] args) {

        Shape s = new Shape(12, 13, 14);

        System.out.println(s.length + "-" + s.width + "-" + s.height);
    }
}
/* OUTPUT: 
1
2
3
12-13-14
         happily compiled....
         this()parenthesis statement ka use krke hum overloaded constructor ko kisi constructor k andar call kr 
         sakte h,taki jo kam 1 parameterized constructor kr rha h wahi kam 2 parameterized constructor ko na krna
         pade or jo kam 1 or 2 parameterized constructor kr rhe h wahi kam 3 parameterized constructor ko na krna
         pade,isley 3 parameterized constructor this()parenthesis ka use krke apne hi class k overloaded 2 
         parameterized constructor ko call kr sakta h.  */