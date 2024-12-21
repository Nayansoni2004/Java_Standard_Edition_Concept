import java.util.ArrayList;
class W1 {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new Student("mohan" , 12)); //auto-boxing hogi.
        x.add(new Student("sohan" , 10)); //auto-boxing hogi.   
        x.add(new Student("rohan" , 8));  //auto-boxing hogi.
        x.add(new Student("gohan" , 15)); //auto-boxing hogi.
        x.add(new Student("tohan" , 13)); //auto-boxing hogi. 

        System.out.println(x);/*is line m print krne se pahle internally java toString() Student class ki call
                                kr rha h,isley objects k ref. ki jagah name or age print ho rha h. */
        Student a = new Student("rahan" , 8);
        System.out.println(x.contains(a)); //contains() internally equals() method call krega Student class ki.
       // System.out.println(x.remove(a)); //remove() internally equals() method call krega Student class ki.

        System.out.println(x);/*is line m print krne se pahle internally java toString() Student class ki call
        kr rha h,isley objects k ref. ki jagah name or age print ho rha h. */
    }
}
class Student {
    String name;
    int age;

    Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() { //ref. code print nhi hoga,kyuki toString ko override kia h humne.
        return name + " - " + age;
    }
//ye equals() method String class ki h,kyuki String type ka var. banaya h humne.
    public boolean equals(Object obj) { //1...1....kr k records obj var. m as a index pass hote jayenge.
        Student a = this; //"rahan" wala obj. is m jake hold ho jayega.
        Student b = (Student)obj; //"mohan" wala obj. isme jake hold ho jayega.
        
/*var.*/String nm1 = a.name; //"rahan" wale obj. ka name->"rahan"
/*var.*/String nm2 = b.name; //"mohan" wale obj. ka name->"mohan"

        int ag1 = a.age;//"rahan" ki age.
        int ag2 = b.age; //"mohan" ki age.

        return nm1.equals(nm2) && ag1 == ag2;//kyuki primitive int h age,isley double equals operator lag dia.
    }
}
/*OUTPUT: contains() method ka Output...
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13]
false
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13] */

/*OUTPUT: remove() method ka output...agar "rahan" ki jagah "rohan" likh de to.
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13]
true
[mohan - 12, sohan - 10, gohan - 15, tohan - 13]
 */