class W {
    //main method
    public static void main(String... args) {
        System.out.println(args.length);
    }
}
/*OUTPUT: java ki main method m syntax m koi change nhi kr sakte,kyuki execution main method se start hota h,
          kewal []<-array ki jagah var_args(...)<-ellipsis ka use kr sakte h or variable args ka name kuch bhi
          rakh sakte h,even golu also.
D:\javaprac\47_var_args>javac W.java

D:\javaprac\47_var_args>java W
0

D:\javaprac\47_var_args>java W mohan is a good boy
5

D:\javaprac\47_var_args>java W "mohan is a good boy"
1

D:\javaprac\47_var_args>java W mohanisgoodboy
1
 */