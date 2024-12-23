import java.util.TreeMap;
class B1 {
    //main method
    public static void main(String[] args) {
        TreeMap<Student,College> map = new TreeMap<Student,College>();

        map.put(new Student("om" , 21) , new College("JEC"));
        map.put(new Student("hemant" , 19) , new College("SRIT"));
        map.put(new Student("ratnesh" , 22) , new College("Global"));
        map.put(new Student("ram" , 24) , new College("HEC"));
        map.put(new Student("prateek" , 18) , new College("GGCT"));
        map.put(new Student("kamal" , 23) , new College("GGITS"));

        System.out.println(map);//name k basis pe comparison ho rha h.
    }
}
class Student implements Comparable {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
    public int compareTo(Object obj) {
        Student s1 = this;
        Student s2 = (Student)obj;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm1.compareTo(nm2);
    }
}
class College {
    String name;

    College(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
/*OUTPUT:humne comapareTo(Object obj)<-method ko name k basis pe implement kia h ilsey name k basis pe sorting
         hui.
{hemant - 19=SRIT, kamal - 23=GGITS, om - 21=JEC, prateek - 18=GGCT, ram - 24=HEC, ratnesh - 22=Global} */