import java.util.HashSet;
class K {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new Student("hritik" , 12));
        set.add(new Student("ratnesh" , 18));
        set.add(new Student("raj" , 9));
        set.add(new Student("vikki" , 12));
        set.add(new Student("lukky" , 15));

        Student x = new Student("raj" , 9);

       /*System.out.println(set.contains(x)); /*Contains()<-internally Object class ki equals()call krega or wo 
                                               equals() Objects k ref. code (==)double equality operator se match
                                               kregi,kyuki humne Student class m equals() ko override/implement 
                                               nhi kia h.*/
        System.out.println(set);
        System.out.println(set.remove(x));/*<-return type boolean,ye remove() v Object class ki equals() call kregi
                                              or Objects k ref. code match kregi,isley record remove nhi hoga.*/  
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
}
/*OUTPUT: contains() method ka output...
false */

/*OUTPUT: remove() method ka output...
[vikki - 12, lukky - 15, hritik - 12, ratnesh - 18, raj - 9]
false
[vikki - 12, lukky - 15, hritik - 12, ratnesh - 18, raj - 9] */