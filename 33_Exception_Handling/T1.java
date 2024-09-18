class T1 {
    //main method
    public static void main(String[] args) {
        
        System.out.println(1);

        if(12 < 13) {
            ArithmeticException e = new ArithmeticException();

            throw e;
            //System.out.println(2);
        }

        System.out.println(2);
    }
}
/*OUTPUT: the moment hum ne throw likha control method k pass return chala jata h,jis method pe wo statement run 
ho rha ho,or throw k baad ka code statement run nhi hota.

D:\javaprac\33_Exception_Handling>java T1
1
Exception in thread "main" java.lang.ArithmeticException
        at T1.main(T1.java:8)
 */