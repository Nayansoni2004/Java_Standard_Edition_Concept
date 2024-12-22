import java.util.TreeSet;
class J1 {
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
        Integer ag1 = this.age;
        Integer ag2 = obj.age;
        
        return ag1.compareTo(ag2);
    }
}
/*OUTPUT:12 age wala record sirf 1 bar hi store hoga,kyuki humne Student class m String class ki 
         compareTo(Student obj) implement ki h or comparison age k basis pe kia h to ,second time store krne pr
         compareTo()<-0 return krega to duplicate record store nhi hoga,or ouput age k basis pr assending order
         m sorted way m print hoga,kyuki compareTo()<-age k basis pe design ki h.
[prasad ^ 5, simha ^ 9, ganesh ^ 10, vijendra ^ 12, kartik ^ 18]<-age k basis m assending order m sorted way m store hue records set var m.
 */