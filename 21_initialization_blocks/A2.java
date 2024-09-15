class A2 {
    //instance-level initialization block...
    void pro() {
        System.out.println("A2");
    }
    //main method
    public static void main(String[] args) {
        A2 x = new A2();

        x.pro();
        x.pro();
        x.pro();
        x.pro();
        x.pro();
    }
}
/* D:\javaprac\21_initialization_blocks>java A2
A2
A2
A2
A2
A2
class A2 m initialization block nhi h method h or method ko jitni bar call krte h utni bar run hoti h...
*/