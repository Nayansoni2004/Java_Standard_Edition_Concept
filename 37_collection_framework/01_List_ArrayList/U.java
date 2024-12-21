import java.util.ArrayList;
class U {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new Student("mohan" , 12));
        x.add(new Student("sohan" , 10));
        x.add(new Student("rohan" , 8));
        x.add(new Student("gohan" , 15));
        x.add(new Student("tohan" , 13));

        System.out.println(x);

        Student a = new Student("rohan" , 8); //is line se 1 or new Student Object ban jayega.
        x.remove(a); /*ye (a) m Student obj. ka ref. code rakha h.to remove() objects k ref. code match krega 
                       jo ki alag-alag honge to kuch remove nhi hoga.*/
                       
        System.out.println(x);
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
/*OUTPUT:kuch remove nhi hua kyuki new keyword se 1 new Student object ban gya or usme rohan 8 jake assign ho gya.
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13]
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13]
  */