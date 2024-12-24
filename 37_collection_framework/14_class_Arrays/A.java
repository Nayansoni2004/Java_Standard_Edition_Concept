import java.util.Arrays;
class A {
    //main method
    public static void main(String[] args) {
        int[] x = {56 , 9 , 34 , 19 , 27 , 5 , 48};
        //Iterating array of int primitive type through Enhanced forloop.
        for(int next : x) {
            System.out.print(next + " ");
        }

        Arrays.sort(x);//<-sort(int[] a) method m array pass krte h jo sort krna h,is line pr array sort ho gya h.
        System.out.println();//sort hone k baad 1 line ka gap de deta hu.

        //Iterating sorted array through Enhanced forLoop.
        for(int next : x) {
            System.out.print(next + " ");
        }
    }
}
/*OUTPUT:
D:\javaprac\37_collection_framework\14_class_Arrays>java A
56 9 34 19 27 5 48
5 9 19 27 34 48 56 */