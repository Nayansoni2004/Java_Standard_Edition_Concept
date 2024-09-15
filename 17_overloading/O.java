//~~~~~~~CONSTRUCTOR OVERLOADING~~~~~~
class O {
    //main  method...
    public static void main(String[] args) {
        Shape s1 = new Shape(23);
        Shape s2 = new Shape(45,65,74); //call any one object at a time,and do comment other two.
        Shape s3 = new Shape(12,13);      
    }
}

class Shape {
    //variable members...
    int length; 
    int width;
    int height;

    //constructor overloading...NOTE: constructor kabhi inherit nhi hota.
         /*-------PARAMETER COUNT MIS-MATCH-----------*/
//constructor a member function of a class...
    Shape(int length) {
        System.out.println("Shape(int)");
    }
//constructor a member function of a class...
    Shape(int length, int width) {
        System.out.println("Shape(int, int)");
    }
//constructor a member function of a class...
    Shape(int length, int width, int height) {
        System.out.println("Shape(int, int, int)");
    }
}
/* happily compiled and runned.....
NOTE: class m code kewal do jagah hi likh sakte h,method k andar or constructor k andar!
1 class m same name se multile constructors bana sakte h but parameter body mis-match hona chahiye,or yahi constructor
overloading kahlati h,constructor ka name class k name se exact match krna chahiye,matlab constructor ka name
class k name pr hi rakha jata h,or constructor m return type nhi hota h.
Shape class m Shape name se three constructors banaye h,or teeno constructors ki parameter body mis-match kr rhi
h,legal constructor overloading h,or jub bhi Shape class ka object banaya jayega or jo bhi parameter call krenge
wahi constructor call hoga main method k andar.
*/