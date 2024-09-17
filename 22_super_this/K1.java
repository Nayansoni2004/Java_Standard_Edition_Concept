class Z1 {
    //(non-instance-level)variable
    static int t = 98;
}

class K1 extends Z1 {
    //(non-instance-level)variable
    static int t = 67;
    //(non-instance-level)method
    static void info() {
        int t = 900;
        System.out.println(t);
        System.out.println(K1.t); //this keyword is not applicable here!
        System.out.println(Z1.t); //super keyword is not applicable here!
    }
    //main method
    public static void main(String[] args) {
        info();  //static method ko main method m direct call kr sakte h,legal h!!!
    }
}/* OUTPUT:
900
67
98
kyuki hum static block/method k andar "this" or "super" keyword ka use nhi kr sakte,isley child class or parent
class k instance var. ko static method m access krne k liye hum classname dot var.name likh kr access kr lenge.
*/ 