import java.util.HashSet;
import java.util.LinkedHashSet;
class T {
    //main method
    public static void main(String[] args) {
        Student x = new Student("gurmeet" , 21);
        Student y = new Student("gurdeep" , 20);
        Student z = new Student("prabhjeet" , 19);
        Student t = new Student("simran" , 22);

       // HashSet set = new HashSet();
       LinkedHashSet set = new LinkedHashSet();

        set.add(x);
        set.add(y);
        set.add(z);
        set.add(t);

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
        return name + " ~ " + age;
    }

    public boolean equals(Object obj) { //ye method to aise hi faltu bana di,koi use nhi h is example m.
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

    public int hashCode() { //ye method bhi aise hi faltu bana di,koi use nhi h is example m.
        int code = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i = 0 ; i < name.length() ; i++) {
            code = code + abc.indexOf(name.charAt(i));
        }
        return code;
    }
}
/*OUTPUT: HashSet ka output,HashSet m na hi ordering milegi or na hi sorting milegi.
[prabhjeet ~ 19, gurmeet ~ 21, simran ~ 22, gurdeep ~ 20] */

/*OUTPUT: LinkedHashSet ka output,LinkedHashSet ordered h,sorted nhi h.
[gurmeet ~ 21, gurdeep ~ 20, prabhjeet ~ 19, simran ~ 22] */