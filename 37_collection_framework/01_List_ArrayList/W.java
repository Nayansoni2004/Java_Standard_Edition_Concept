import java.util.ArrayList;
class W {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new Student("mohan" , 12));
        x.add(new Student("sohan" , 10));
        x.add(new Student("rohan" , 8));
        x.add(new Student("gohan" , 15));
        x.add(new Student("tohan" , 13));

        System.out.println(x);

        Student a = new Student("rahan" , 8);
        System.out.println(x.contains(a)); //(a)<- m ref. code rakha h. //ye contains() equals() ko call kr rhi h.(internally)
       // System.out.println(x.remove(a)); //ye remove() internally Student class ki equals() call kr rhi h.

        System.out.println(x);
    }
}
class Student {
    String name;
    int age;

    Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() { //toString() override ki h isley ref. code print nhi honge name or age print honge.
        return name + " - " + age;
    }

    public boolean equals(Object obj) { //ye equals()method obj. k ref. code match nhi unki properties m comparison kregi.(bec. humne implement kri h Object class ki nhi h.)
        System.out.println(this.name + " - " + ((Student)obj).name);
        return this.name.equals(((Student)obj).name) && this.age == ((Student)obj).age;
    }                                       //age primitive int h,isley == operator se bhi comparison kr sakte h.
}
/*OUTPUT:contains() ka output...
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13]
rahan - mohan
rahan - sohan
rahan - rohan
rahan - gohan
rahan - tohan
false
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13] */

/*OUTPUT:remove() ka output...agar "rahan" ki jagah "rohan" kr de to ye output aaya,1 record kam ho gya.
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13]
rohan - mohan
rohan - sohan
rohan - rohan
true
[mohan - 12, sohan - 10, gohan - 15, tohan - 13] */