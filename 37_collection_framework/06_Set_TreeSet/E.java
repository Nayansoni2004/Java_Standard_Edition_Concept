/*Concept:TreeSet sorted collection class h or kisi ik property k basis pe hi comparison kr k records ko 
          arrange/store krta,humne bataya nhi h ki name k basis m comparison krna h ya age k basis m,isley 
          exception aaya,to hume compareTo(Object)method ko Student class m Comparable Interface se implement 
          krna padega,problem solve ho ayegi exception ki.*/ 
import java.util.TreeSet;
class E {
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
class Student {
    String name;
    Integer age;/*int primitive var. h or vo khud m hi value store krta h,isley Integer banaya taki Integer obj.
                  bane or wrapper classes Comparable Interface ko implement krte h,to Integer wrapper class m
                  compareTo(Object)<-method hogi to hum us method ko override krenge Student m.*/
    Student(String name , Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ^ " + age;
    }
}
/*OUTPUT: exception aaya kyuki TreeSet sorted collection class h,or kisi 1 property k basis pe hi records ko 
          sort kr k store krta h,lekin hum ne bataya nhi h ki kis property k basis pe comparison krna h, name
          k basis pe ya age k basis pe,is problem ko solve krne k liye hume apni class ko Comparable Interface
          ka sub-class banana padega or Comparable Interface ki compareTo(Object)<-method ko implement krna 
          padega,tabhi kisi 1 property k basis pe TreeSet record ko store kr payega or exception nhi aayega.
Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
        at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
        at java.base/java.util.TreeMap.put(TreeMap.java:785)
        at java.base/java.util.TreeMap.put(TreeMap.java:534)
        at java.base/java.util.TreeSet.add(TreeSet.java:255)
        at E.main(E.java:7) */