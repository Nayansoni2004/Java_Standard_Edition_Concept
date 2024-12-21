//Concept: Vector ki initial capacity 10 hoti h,lekin Vector class ka constructor se hum capacity set kr sakte h.
import java.util.Vector;
class B {
    //main method
    public static void main(String[] args) {
        Vector v = new Vector(300); //Vector class m constructor h Vector(int intitalcapacity). 

        System.out.println(v.capacity());
    }
}
//OUTPUT: 300