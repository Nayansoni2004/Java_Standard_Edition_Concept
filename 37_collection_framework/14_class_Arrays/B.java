import java.util.Arrays;
class B {
    //main method
    public static void main(String[] args) {
        String[] x = {"samyak" , "hitesh" , "vikas" , "ganesh" , "manoj"};
         
        //Iterating array of string through Enhanced forLoop.
        for(String next : x) {
            System.out.print(next + " ");
        }

        Arrays.sort(x);//<-is method m array pass kro sort kr deta h,kyuki sort(Object[] a)<-parameterized h.
        System.out.println();//yaha pr 1 empty line draw kr deta hu.

        //Iterating sorted array of String through Enhanced forLoop.
        for(String next : x) {
            System.out.print(next + " ");//sorted array ascending order m print hoga.
        }
    }
}
/*OUTPUT:
D:\javaprac\37_collection_framework\14_class_Arrays>java B
samyak hitesh vikas ganesh manoj
ganesh hitesh manoj samyak vikas */