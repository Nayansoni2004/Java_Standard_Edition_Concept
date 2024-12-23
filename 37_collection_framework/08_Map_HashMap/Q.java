import java.util.HashMap;
class Q {
    //main method
    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap<Student,Integer>();

        map.put(new Student("om" , 12) , 78);
        map.put(new Student("umesh" , 19) , 97);
        map.put(new Student("jay" , 13) , 64);//key1
        map.put(new Student("ekta" , 9) , 83);
        map.put(new Student("deepak" , 5) , 99);
        map.put(new Student("jay" , 13) , 77);//duplicate key2

        System.out.println(map);
        Boolean a = map.containsValue(77);//true kyuki value column m check krega ki aisa koi value exists krta h kya?returnType boolean.
        System.out.println(a);
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
/*OUTPUT: true aaya kyuki Student key k obj. alag alag h,but value ka obj. to 1 hi h to value column m check 
          krega ki value 77 exists krta h kya/krta h to true /nhi krta to false.
{ekta - 9=83, jay - 13=77, deepak - 5=99, om - 12=78, umesh - 19=97, jay - 13=64}
true */