import java.util.HashSet;
class S {
    //main method
    public static void main(String[] args) {
        Student x = new Student("gurmeet" , 21);
        Student y = new Student("gurdeep" , 20);
        Student z = new Student("prabhjeet" , 19);
        Student t = new Student("simran" , 22);
        
        HashSet set = new HashSet();

        set.add(x);
        set.add(y);
        set.add(z);
        set.add(t);

        Student m = new Student("gurdeep" , 32);

        System.out.println(set.contains(m));//contains()<-internally Student class ki equals() or hashCode() call krega.
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
            Student b = (Student)obj; //type-cast.

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
        }
        return flag;
    }

    public int hashCode() {
        int code = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i = 0 ; i < name.length() ; i++) {
            code = code + abc.indexOf(name.charAt(i));
        }
        return code;
    }
}
//OUTPUT: true 