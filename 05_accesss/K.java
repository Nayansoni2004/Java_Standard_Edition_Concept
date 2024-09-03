class K extends F {

    //main method...
    public static void main(String[] args) {
        
        K.pro();

        System.out.println(K.s);
    }
}

class F {
    static double s = 9.8;

    static void pro() {
        System.out.println("Hello SYSTEM>>>");
    }
}
//extends keyword likhne se K class ne F class ki sari properties inherit kr li h or F class m static members h
//kyuki according to rule static context m static members direct access kr sakte h legal h. isley K.s likha 
// K class ka nam h or s F class ka variable h.
//OUTPUT:
//Hello SYSTEM>>>
//9.8