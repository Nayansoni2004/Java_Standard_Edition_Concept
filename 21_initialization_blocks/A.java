class A {
    //instance(non-static)Initialization Block
    {
        System.out.println("D");
    }
    //main method
    public static void main(String[] args) {
        A x = new A();//constructor call

        A y = new A();//constructor call

        A z = new A();//constructor call
    }
}
/* D:\javaprac\21_initialization_blocks>javac A.java

D:\javaprac\21_initialization_blocks>java A
A
A
A
object ban ne pr jaise hi constructor call hota h uska super();call complete hone pr turant instance-level 
initialization block us object pr automatic call ho jate h....or initialization blocks order m run hote h...upar
se niche ki ore.....
*/
