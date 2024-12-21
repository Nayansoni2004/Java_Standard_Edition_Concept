import java.util.ArrayList;
class T {  
    //main method  
    public static void main(String[] args) {  
        ArrayList x = new ArrayList();  

        x.add(new Student("mohan" , 12));    
        x.add(new Student("sohan" , 10));   
        x.add(new Student("rohan" , 8));                                    
        x.add(new Student("gohan" , 15));   
        x.add(new Student("tohan" , 13));   

        System.out.println(x);
    }            
}     
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    } 
}
/*OUTPUT: kyuki toString() method Student class m override kri h to ye Output aaya,ref. code print nhi hua 
          Objects ka. 
[mohan - 12, sohan - 10, rohan - 8, gohan - 15, tohan - 13] */

/*OUTPUT: agar Student class ki toString() method jo override kri h, usko comment kr de to ye Output aaya,kyuki
          objects k ref. code alag-alag h to ref. code hi print honge.
[Student@36baf30c, Student@7a81197d, Student@5ca881b5, Student@24d46ca6, Student@4517d9a3] */