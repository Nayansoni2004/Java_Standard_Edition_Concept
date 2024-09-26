class K1 {
    K1(int... x) {
        //iterating array of type int through Enhanced for-loop.
        for(int j : x) 
            System.out.println(j);
    }

    //main method
    public static void main(String[] args) {
        K1 y = new K1(new int[] {12, 45, 67, 23});
    }
}
/*CONCLUSION: hum constructor ki parameter body m direct array pass nhi kr sakte,isley array object create kr k
              pass kia h to internally constructor call hoga or array k elements print honge.
OUTPUT:
D:\javaprac\47_var_args>javac K1.java

D:\javaprac\47_var_args>java K1
12
45
67
23
 */