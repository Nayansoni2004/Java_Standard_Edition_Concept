class Z {

    int q = 222;//variable declaration cum initialization

    void pro() {
        System.out.println("Hello Duniya Waloon...");
    }
}
class C extends Z {
    
    void pro() {
        System.out.println("Hii Duniya Waloon!!!");
    }
    //main method
    public static void main(String[] args) {

        C c = new C();

        System.out.println(c.q);

        c.pro();
        
    }
}
/* OUTPUT:-222
           Hii Duniya Waloon!!!
CONCLUSION:-C class child class h Z class ka,or C class k object k through member method ko access kr rhe h or 
(Z or C)dono classes m same method h isley pahle C class ka object C class m c.pro(); method ko dhundega agar C
class m nhi miligi tab phir Z class m dhundega or kyuki pro(); method object ko C class m hi milgyi isley wahi bs
print hui or method ka call khatam ho gya.
*/