import java.util.TreeSet;
class J {
    //main method
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(new Student("kartik" , 18));
        set.add(new Student("simha" , 9));
        set.add(new Student("vijendra" , 12));
        set.add(new Student("prasad" , 5));
        set.add(new Student("ganesh" , 10));
        set.add(new Student("vijendra" , 12));

        System.out.println(set);
    }
}
class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name , Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ^ " + age;
    }

    public int compareTo(Student obj) {
        String nm1 = this.name;
        String nm2 = obj.name;

        return nm1.compareTo(nm2);
    }
}
/*OUTPUT:"vijendra" sirf 1 bar hi store hoga ,kyuki second time store pr compareTo(Student obj)<-method (zero)
          return kregi,to duplicate record store nhi hoga,kyuki hume ne Student class m Comparable Interface
          ko parent Interface banaya h or String class ki compareTo()<-method ko name k basis pe implement kia h
          to name k assending order m sorted way m et print hoga.
[ganesh ^ 10, kartik ^ 18, prasad ^ 5, simha ^ 9, vijendra ^ 12]<-name k assending order,sorted way m store hua set m.          
*/