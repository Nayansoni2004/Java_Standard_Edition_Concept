import java.util.TreeSet;
class I {
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
class Student implements Comparable {
    String name;
    Integer age;

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
/*OUTPUT:"vijendra" sirf 1 bar hi store hua kyuki second time store krne pr compareTo()method ne 0 return kia 
          hoga,isley duplicate store nhi ho sakta,kyuki humne compareTo()method name k basis pe implement ki h
          isley name k basis pe comparison hoga,or "vijendra" sirf 1 bar store hoga,or sorted order m output
          aaya,i.e name k assending order m.
[ganesh - 10, kartik - 18, prasad - 5, simha - 9, vijendra - 12] <-name k assending order m arrange hua. */