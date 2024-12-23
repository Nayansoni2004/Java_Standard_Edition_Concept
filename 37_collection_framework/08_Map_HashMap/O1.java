import java.util.HashMap;
class O1 {
    //main method
    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap<Student,Integer>();

        map.put(new Student("om" , 12) , 78);
        map.put(new Student("umesh" , 19) , 97);
        map.put(new Student("jay" , 13) , 64); //key1
        map.put(new Student("ekta" , 9) , 83);
        map.put(new Student("deepak" , 5) , 99);
        map.put(new Student("jay" , 13) , 77);//duplicate key2

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

    public boolean equals(Object obj) {
        Student a = this;
        Student b = (Student)obj;

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.equals(nm2) && a.age == b.age;
    }
}
/*OUTPUT: equals()<-method implement krne k baad bhi duplicate key("jay" - 13) allowed ho rhi h,kyuki HashMap
          name se hi samajh aa rha h Hash-Based collection class h,to hashcode()implement kr k hashing kr do.
{ekta - 9=83, jay - 13=77, deepak - 5=99, om - 12=78, umesh - 19=97, jay - 13=64} */