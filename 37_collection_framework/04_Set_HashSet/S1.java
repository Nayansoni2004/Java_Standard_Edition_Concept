import java.util.HashSet;
class S1 {
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

        System.out.println(set);
        Student m = new Student("gurdeep" , 32);
        set.remove(m);//remove()<-internally Student class ki equals() or hashCode() call kregi.
        System.out.println(set);
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
/*OUTPUT:
[prabhjeet - 19, gurmeet - 21, simran - 22, gurdeep - 20]
[prabhjeet - 19, gurmeet - 21, simran - 22] */