abstract class X4 {

    //method declaration
    abstract void pqr();

}

abstract class G extends X4 {

    //main method
    static public void main(String[] args) {

        System.out.println("Hello Duniya Waloon!!!");
    } 
} 
/* OUTPUT: happily compiled and runed 
           Hello Duniya Waloon!!!
abstract class ko instantiation k through access nhi kr skate,lekin inheritance k through access kr sakte h,
but inheritance k through krne pr child class m abstract class ki methods ko define krna padega ya phir sub-class
ko abstract mark krna padega....or G.java m sub-class ko abstract mark kia h isley happily compiled ho gya..

*/