import java.util.HashSet;
class L {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new Student("hritik" , 12));
        set.add(new Student("ratnesh" , 18));
        set.add(new Student("raj" , 9));
        set.add(new Student("vikki" , 12));
        set.add(new Student("lukky" , 15));

        Student x = new Student("raj" , 9);
        
        System.out.println(set);
        System.out.println(set.remove(x));/*remove() Student class ki equals() call nhi krega,kyuki HashSet ik
                            Hash-Based collection class h,to pahle hashing krna padegi,using hashcode() method.*/
       // System.out.println(set.contains(x));
        /*contains()<-Student class ki equals() ko call nhi kregi,bec.HashSet is a Hash-Based collection class.*/                                    
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
        System.out.println(flag + "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");/*ye line ye check krne likhi,ki 
equals()method call ho rhi h ya nhi,matlab remove() or contains() is equals()method ko call kr rhe h ya nhi.*/
        if(obj instanceof Student) {
            Student a1 = this;
            Student a2 = (Student)obj;

            String nm1 = a1.name;
            String nm2 = a2.name;

            flag = nm1.equals(nm2) && a1.age == a2.age;
        }
        return flag;
    }
}
/*OUTPUT: remove() ne equals() ko call ki hi nhi kyuki HashSet Hash-Based collection class h,isley pahle 
          hashing krni padegi,tabhi hamari Student class ki equals()method call hogi.
[vikki - 12, lukky - 15, hritik - 12, ratnesh - 18, raj - 9]
false
[vikki - 12, lukky - 15, hritik - 12, ratnesh - 18, raj - 9] */

/*OUTPUT:contains() ne Student class ki  equals() ko call nhi kia kyuki HashSet Hash-Based collection class h,
         isley pahle hashing krna padegi,hashcode() method ko equals()method k pahle override/implement kr k.
[vikki - 12, lukky - 15, hritik - 12, ratnesh - 18, raj - 9]
false
[vikki - 12, lukky - 15, hritik - 12, ratnesh - 18, raj - 9] */