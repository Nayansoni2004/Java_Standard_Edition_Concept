class P {
    //main method
    public static void main(String[] args) {
        Student x = new Student("Gurmeet" , 21); //Student class ki toString() or equals() call hogi. 
        Student y = new Student("Gurmeet" , 21); //Student class ki toString() or equals() call hogi.
        Student z = new Student("Gurmeet" , 21); //Student class ki toString() or equals() call hogi.

        //check:It is reflexive.
        //kya me mere jaisa hu<-tabhi to reflexive kehlaya!
       // System.out.println(x.equals(x));
       // System.out.println(y.equals(y));
       // System.out.println(z.equals(z));

        //check:It is symmetric.
        //agar ram sita jese h,to sita bhi ram jesi hogi<-tabhi to symmetric kehlaya!
       // System.out.println(x.equals(y) + " - " + y.equals(x));
       // System.out.println(x.equals(z) + " - " + z.equals(x));
       // System.out.println(z.equals(y) + " - " + y.equals(z));

       //check:It is transitive.
       //agar ram sita jese h,or sita lakshman jesi h,to lakshman ram jesa hua na<-tabhi to transitive kehlaya!
       // System.out.println(x.equals(y) + " - " + y.equals(z) + " - " + z.equals(x));
       
          //check:It is Consistent:
          //means that multiple time either true or false consistent on object.
         // System.out.println(x.equals(y));
         // System.out.println(x.equals(y));
         // System.out.println(x.equals(y));
         // System.out.println(x.equals(y));

         //check:null test must produce false,should not produce true in any case.
         System.out.println(x.equals(null));
         System.out.println(y.equals(null));
         System.out.println(z.equals(null)); 
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
        return name + " ~ " + age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;
        if(obj instanceof Student) {//ye if{} block tabhi run hoga,jub obj is-a relationship pass krega Student k sath.
            Student a = this;
            Student b = (Student)obj;//String obj. milega,usko type-cast krna padega,Student m.

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
        }
        return flag;
    }
}
/*OUTPUT: Reflexive:
true
true
true */

/*OUTPUT: Symmetric:
true - true
true - true
true - true */

/*OUTPUT: Transitive:
true - true - true */

/*OUTPUT: Consistent: i.e.(multiple time either true or false Consistent on object.)
true
true
true
true */

/*OUTPUT: check: null test must produce false,& should not produce true in any case.
false
false
false */