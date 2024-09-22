class A {
    //main method
    public static void main(String[] args) {
        aaa();
    }

    static void aaa() {
        bbb();

        for(int i=0 ; i<30 ; i++) {
            System.out.println("aaa()" + i);
        }
    }

    static void bbb() {
        ccc();

        for(int i=0 ; i<30 ; i++) {
            System.out.println("bbb()" + i);
        }
    }

    static void ccc() {
        for(int i=0 ; i<30 ; i++) {
            System.out.println("ccc()" + i);
        }
    }
}
/*OUTPUT:
D:\javaprac\35_Multi_Threading>javac A.java

D:\javaprac\35_Multi_Threading>java A
ccc()0
ccc()1
ccc()2
ccc()3
ccc()4
ccc()5
ccc()6
ccc()7
ccc()8
ccc()9
ccc()10
ccc()11
ccc()12
ccc()13
ccc()14
ccc()15
ccc()16
ccc()17
ccc()18
ccc()19
ccc()20
ccc()21
ccc()22
ccc()23
ccc()24
ccc()25
ccc()26
ccc()27
ccc()28
ccc()29
bbb()0
bbb()1
bbb()2
bbb()3
bbb()4
bbb()5
bbb()6
bbb()7
bbb()8
bbb()9
bbb()10
bbb()11
bbb()12
bbb()13
bbb()14
bbb()15
bbb()16
bbb()17
bbb()18
bbb()19
bbb()20
bbb()21
bbb()22
bbb()23
bbb()24
bbb()25
bbb()26
bbb()27
bbb()28
bbb()29
aaa()0
aaa()1
aaa()2
aaa()3
aaa()4
aaa()5
aaa()6
aaa()7
aaa()8
aaa()9
aaa()10
aaa()11
aaa()12
aaa()13
aaa()14
aaa()15
aaa()16
aaa()17
aaa()18
aaa()19
aaa()20
aaa()21
aaa()22
aaa()23
aaa()24
aaa()25
aaa()26
aaa()27
aaa()28
aaa()29
 */