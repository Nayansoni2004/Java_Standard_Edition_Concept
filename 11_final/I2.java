//final keyword ka example no.6
final class M {

    boolean z = true;//variable declaration cum initialization

}

class I2 {

    //main method 
    public static void main(String[] args) {

        M m = new M();//object creation of final class M

        System.out.println(m.z);//access through instantiation

        m.z = false;//modifying the var. of class M in class I2

        System.out.println(m.z);//print the modifyed var.
    }
}
/*OUTPUT:
true
false
*/