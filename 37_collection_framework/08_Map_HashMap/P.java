import java.util.HashMap;
class P {
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
        Boolean x = map.containsKey(new Student("jay" , 13));
        System.out.println(x); //false
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
/*OUTPUT: false aaya kyuki humne Student class m equals() or hashCode() method ko implement nhi kia h,to obj.
          alag-alag banenge or jub containsKey(Object key)call krenge to Object class ki equals()method
          obj. k ref. code match kregi jo ki alag alag h isley containsKey(Object key) false return krega.
{ekta - 9=83, jay - 13=77, deepak - 5=99, om - 12=78, umesh - 19=97, jay - 13=64}
false */