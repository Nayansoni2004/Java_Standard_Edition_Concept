import java.util.ArrayList;
class V {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new Student("mohan" , 12));
        x.add(new Student("sohan" , 10));
        x.add(new Student("rohan" , 8));
        x.add(new Student("gohan" , 15));
        x.add(new Student("tohan" , 13));

        System.out.println(x);

        Student a = new Student("rohan" , 8);
        System.out.println(x.contains(a)); //(a)<- m ref. code rakha h,or dono x or (a) ka ref.code alag h.

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

    public String toString() {
        return name + " - " + age;
    }
}
/*OUTPUT:false aaya kyuki Contains m (a) pass kia h jis m ref. code rakha h,to contains method Objects k ref. 
         code match krega 1...1... kr k to match nhi honge to false boolean result return krega. 
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13]
false
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13]
 */