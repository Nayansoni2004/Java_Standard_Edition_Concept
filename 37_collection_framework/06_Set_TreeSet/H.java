import java.util.TreeSet;
class H {
    //main method
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(new Student("kartik" , 18));
        set.add(new Student("simha" , 9));
        set.add(new Student("vijendra" , 12));
        set.add(new Student("prasad" , 5));
        set.add(new Student("ganesh" , 10));

        System.out.println(set);
    }
}
class Student implements Comparable {
    String name;
    Integer age;/*wrapper class Integer ka obj. banega usme value store hogi,primitive int isley nhi banaya,
                  kyuki wo khud m hi value ko store kr leta h,or Integer isley banay h,kyuki sari wrapper classes
                  Comparable Interface ko implement krti h,to Integer pr hum Integer class ki compareTo(Object)
                  method call kr payenge.*/
    Student(String name , Integer age) {
        this.name = name;
        this.age = age;
    }              

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Object obj) {
        Student x = this;
        Student y = (Student)obj;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm1.compareTo(nm2);
    }
}
/*OUTPUT: kyuki compareTo method ko name k basis pe implement kia h,isley name k basis pe assending order m 
          set arrange hua.
[ganesh - 10, kartik - 18, prasad - 5, simha - 9, vijendra - 12] */