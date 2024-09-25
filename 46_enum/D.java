/*private enum Bablu {

} */
/*OUTPUT:
D:\javaprac\46_enum>javac D.java
D.java:1: error: modifier private not allowed here
private enum Bablu {
        ^
1 error */ 

/*protected enum Bablu {

}*/
/*OUTPUT:
D:\javaprac\46_enum>javac D.java
D.java:11: error: modifier protected not allowed here
protected enum Bablu {
          ^
1 error
 */

public enum D {

}
/*OUTPUT: happily compiled...
hum class or interface ki tarah enum ko bhi private/protected mark nhi kr sakte,jese class,interface pr public
or default access controls applicable h ,waise hi enum pr bhi kewal public or default access-controls applicable
h.
D:\javaprac\46_enum>javac D.java
 */