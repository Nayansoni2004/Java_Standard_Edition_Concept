import java.util.ArrayList;
class N {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //index-0
        x.add(2.34); //index-1
        x.add(74); //index-2
        x.add(true); //index-3
        x.add('Y'); //index-4

        System.out.println(x);

        x.get(0).length();
        x.get(0).toString();
    }
}
/*OUTPUT: compilation error aaya kyuki length()method Object class m nhi,lekin toString method h.
D:\javaprac\37_collection_ArrayList>javac N.java
N.java:15: error: cannot find symbol
        x.get(0).length();
                ^
  symbol:   method length()
  location: class Object
Note: N.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
 */