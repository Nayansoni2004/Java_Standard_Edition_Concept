import java.util.TreeMap;
class B2 {
    //main method
    public static void main(String[] args) {
        TreeMap<Student,College> map = new TreeMap<Student,College>();

        map.put(new Student("om" , 21) , new College("JEC"));
        map.put(new Student("hemant" , 19) , new College("SRIT"));
        map.put(new Student("ratnesh" , 22) , new College("Global"));
        map.put(new Student("ram" , 24) , new College("HEC"));
        map.put(new Student("prateek" , 18) , new College("GGCT"));
        map.put(new Student("kamal" , 23) , new College("GGITS"));

        System.out.println(map);//age k basis pe sort hoga TreeMap,compareTo age k basis pe implement kia h.
    }
}
class Student implements Comparable<Student>{
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
    public int compareTo(Student obj) {
        return this.age.compareTo(obj.age);
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
/*OUTPUT:TreeMap sorted collection class k to batana padta h ki kis basis pe key to sort krna h name k basis pe
         ya age k basis pe ascending order m ya descending order m,compareTo age k basis pe implement kia h 
         isley age k basis pe sort hui keys.
{prateek - 18=GGCT, hemant - 19=SRIT, om - 21=JEC, ratnesh - 22=Global, kamal - 23=GGITS, ram - 24=HEC} */