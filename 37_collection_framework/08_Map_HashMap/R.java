import java.util.HashMap;
class R {
    //main method
    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap<Student,Integer>();

        map.put(new Student("om" , 12) , 78);
        map.put(new Student("umesh" , 19) , 97);
        map.put(new Student("jay" , 13) , 64); //key1
        map.put(new Student("ekta", 9) , 83);
        map.put(new Student("deepak" , 5) , 99);
        map.put(new Student("jay" , 13) , 77);//duplicate key2
        
        System.out.println(map);
        System.out.println(map.remove(new Student("jay" , 13)));//key do value remove kr dega or sath hi key bhi remove kr dega.
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
/*OUTPUT: null aaya kyuki obj. k ref. code alag alag h or remove(new Student("jay" , 13))<-ka ref. code alag h
          to ref. code match nhi honge to fir key remove nhi hoga to null return krega remove(Object key)<-method.
          kyuki "jay"-13 key exists nhi krti h.
{ekta - 9=83, jay - 13=77, deepak - 5=99, om - 12=78, umesh - 19=97, jay - 13=64}
null */