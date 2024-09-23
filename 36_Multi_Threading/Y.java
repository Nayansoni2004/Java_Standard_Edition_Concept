//Concept: we can make our own Thread Group's by Using library class ThreadGroup,located in lang package.
/*point 1:hum jo bhi naya Thread group banate h,wo kisi Existing Thread group ka part hota h,or un thread groups
  k bich parent child relationship hoti h. */  
class Y {
    //main method
    public static void main(String[] args) {
    ThreadGroup tg = new ThreadGroup("QUAD");//new Thread group banega jsika name humne "QUAD" set kia h.
    ThreadGroup parentTg = tg.getParent();
    System.out.println("New Thread Group(QUAD), Without Declaring parent Thread Group,is child of Default Thread Group(Main): " + tg.getName());
    System.out.println("QUAD's Parent Thread Group: " + parentTg.getName());
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Y
New Thread Group(QUAD), Without Declaring parent Thread Group,is child of Default Thread Group(Main): QUAD
QUAD's Parent Thread Group: main
 */