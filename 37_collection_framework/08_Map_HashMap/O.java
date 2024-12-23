import java.util.HashMap;
class O {
    //main method
    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap<Student,Integer>();

        map.put(new Student("om" , 12) , 78);
        map.put(new Student("umesh" , 19) , 97);
        map.put(new Student("jay" , 13) , 64); //key
        map.put(new Student("ekta" , 9) , 83);
        map.put(new Student("deepak" , 5) , 99);
        map.put(new Student("jay" , 13) , 77); //duplicate key
        
        System.out.println(map);
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
/*OUTPUT:duplicate key("jay" - 13) allowed ho rhi h kyuki alag alag obj. bane h to ref. code alag alag honge hi.
{ekta - 9=83, jay - 13=77, deepak - 5=99, om - 12=78, umesh - 19=97, jay - 13=64} */