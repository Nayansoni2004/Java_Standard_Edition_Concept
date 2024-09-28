import java.util.ArrayList;

class O {
    //main method
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("raju");
        names.add("kanha");
        names.add("amrit");
        names.add("chutki");
        names.add("bheem");
        
        //iterating ArrayList of names through forEach() method using lambda expression.
        names.forEach((name) -> System.out.println(name));//pass lambda expression in forEach() method.
    }
}
/*OUTPUT:
D:\javaprac\55_functional_interfaces>javac O.java

D:\javaprac\55_functional_interfaces>java O
raju
kanha
amrit
chutki
bheem
 */