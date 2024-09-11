//final keyword ka example no.5
final class W {

    int k = 100;//variable declaration cum initialization

}

class I1 {

    //main method 
    public static void main(String[] args) {

        W w = new W();//object creation.

        System.out.println(w.k);//access through instantiation

        w.k = 200;//modifying the member variable of final class W

        System.out.println(w.k);//print the modifyed var. of class W

    }
}
/* OUTPUT:
100
200
*/