class Q {
    //main method
    public static void main(String[] args) {
        Student x = new Student("gurmeet" , 21);
        Student y = new Student("gurmeet" , 21);
        Student z = new Student("meetgur" , 21);
        Student t = new Student("gurmit" , 21);

        //test 1:
       // System.out.println(x.hashCode()); //gurmeet ka hashcode=89
       // System.out.println(x.hashCode()); //gurmeet ka hashcode=89
       // System.out.println(x.hashCode()); //gurmeet ka hashcode=89

        //test 2:
       // System.out.println(x.equals(y));
       // System.out.println(x.hashCode() + " - " + y.hashCode());

        //test 3(a):
       // System.out.println(x.equals(z));
       // System.out.println(x.hashCode() + " - " + z.hashCode());

        //test 3(b):
        System.out.println(x.equals(t));
        System.out.println(x.hashCode() + " - " + t.hashCode());
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

        if(obj instanceof Student) {//(Student is-a Student)<-if{} block run hoga,bec. condition true h.
            Student a = this;
            Student b = (Student)obj;//String obj. milega to type-cast krna padega Student m.

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
        }
        return flag;
    }

    public int hashCode() {
        int code = 0;
                    //012345678901234567890123456
        String abc = " abcdefghijklmnopqrstuvwxyz";//space bhi dia h kyuki name ki indexing 1 se start hoti h.

        for(int i = 0 ; i < name.length() ; i++) {//nayan ki length 5 h to 1 kam,0 se leke 4 tak chalega loop.
            code = code + abc.indexOf(name.charAt(i));//pahle bracket()solve hoga then indexOf run hoga.
        }    //method indexOf(int ch)<-return type int.
        return code;
    }
}
/*OUTPUT: test 1:
89
89
89 <-ticket gurmeet ka hashcode bar bar wahi aa rha h,lekin bucket sirf 1 bar banegi #51 se or name bhi gurmeet
     1 bar hi store hoga.*/

/*OUTPUT: test 2:
true
89 - 89 <-hashcode x or y dono ticket(name) k same h,matlab same bucket m dono ticket(name) rakhi jayengi,
          lekin dono ticket k name ki alphabet order same h isley,fir se wahi name bucket m nhi rakha jayega,
          kyuki pahle se wo ticket exists krta h. */

/*OUTPUT: test 3(a):
false <-false aaya matlab dono object x or z ka name match nhi krta, 
89 - 89               lekin ticket(name) k hashcode same h,isley same bucket m dono (ticket)name rakhe jayenge,
                      kyuki gurmeet or meetgur ticket ka hashcode same h or name k alphabet order bhi match ni
                      kr rhe isley dono tickets 1 hi #89 wali bucket m rakhi jayengi.*/

/*OUTPUT: test 3(b):
false <-false aya kyuki gurmeet or gurmit dono name mis-match h,
89 - 88          or kyuki dono gurmeet or gumit ticket k hashCode alag h,isley gurmeet #89 wali bucket m rakha 
                 jayega or gurmit k liye new bucket banegi #88 name se or isme gurmit ticket rakhi jayegi.*/ 