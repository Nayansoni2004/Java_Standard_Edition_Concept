/*is example m pura khel overriding pe tika h,overriding hi nhi hui to DYNAMIC METHOD DISPATCH v nhi hua or isley
 OBJECT KA TYPE bhi runtime ne nhi dekha*/
//its not Overriding, it is Overloading.
class Car { }

class SportsCar extends Car { }

//apni test class
class E {
    //non-instance level method member
    static void pro(Car car) {
        System.out.println("car");
    }

    static void pro(SportsCar sportsCar) {
        System.out.println("SportsCar");
    }

    //main method
    public static void main(String[] args) {

        Car x = new SportsCar();  //polymorphic assignment...

        pro(x);  //method call by passing reference var. as a parameter
    }
}//OUTPUT:   car //parent class ka method version.
/* car print hua kyuki static methods class load hone pr hi resolve ho jati h,or compile time pr compiler var. ka
type check krta h ki var. ka type kya h,or var. parent type ka h,to compiler kehta h ki car class ka method run 
hoga,ji me kon compiler,or code runtime ko pass kr deta h,or kyuki method static h,class load hone pr resolve ho
chuki h,to runtime check krta h ki object child ka h,or kyuki overridden method static mark krne se,child class 
m override nhi hoti,overhide hoti h,or kyuki overriding nhi hi ,DYNAMIC METHOD DISPATCH occur nhi hua or over-riding
na hone ki wajah se parent class ka method version run hua.
NOTE: static methods are not a part of DYNAMIC METHOD DISPATCH!
*/