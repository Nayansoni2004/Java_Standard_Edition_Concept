import java.util.HashMap;
class O2 {
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
        boolean flag = false;
        if(obj instanceof Student) {
        Student a = this;
        Student b = (Student)obj;

        String nm1 = a.name;
        String nm2 = b.name;

        flag =  nm1.equals(nm2) && a.age == b.age;
        }
        return flag;
    }

    public int hashCode() {
        int code = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i = 0 ; i < name.length() ; i++) {
            code = code + abc.indexOf(name.charAt(i));
        }
        return code + age;
    }
}
/*OUTPUT:obj. alag alag ban rhe h,fir bhi duplicate key ("jay" - 13) 1 bar hi store hua,kyuki humne Student class
         m equals() or hashCode()<-method ko meaningfully implement kia h.
{jay - 13=77, umesh - 19=97, om - 12=78, ekta - 9=83, deepak - 5=99} */