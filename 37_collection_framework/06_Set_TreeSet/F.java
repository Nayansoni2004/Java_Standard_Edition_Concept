class F {
    //main method
    public static void main(String[] args) { 
        Integer x = Integer.valueOf(12);//<-return type wrapper class Integer Obj.
        Integer y = Integer.valueOf(45);//<-return type wrapper class Integer Obj.
        Integer z = Integer.valueOf(45);//<-return type wrapper class Integer Obj.

        System.out.println(x.compareTo(y)); //Output: -1(positive value).
        System.out.println(y.compareTo(x)); //Output: +1(positive value).
        System.out.println(y.compareTo(z)); //Output: 0(zero as values are same). 
    }
}
/*OUTPUT:
-1
1
0 */