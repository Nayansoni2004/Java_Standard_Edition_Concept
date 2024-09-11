//final keyword ka example no.7
final class O {

    String name ="NAYAN SONI";//variable declaration cum initialization

}

class I3 {

    //main method
    public static void main(String[] args) {

        O o = new O();//object creation

        System.out.println(o.name);//access through instantiation

        o.name = "NAYAN MALVIYA";//modify the member var. of O class in I3 class

        System.out.println(o.name);//print the modifyed var.
    }
}
/* OUTPUT:
NAYAN SONI
NAYAN MALVIYA
*/